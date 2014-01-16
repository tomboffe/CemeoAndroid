// Code generated by dagger-compiler.  Do not edit.
package com.pxl.android.cemeo.core;


import java.util.Set;

import javax.inject.Provider;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;

/**
 * A {@code Binder<CreateMeeting>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 * <p/>
 * Owning the dependency links between {@code CreateMeeting} and its
 * dependencies.
 * <p/>
 * Being a {@code Provider<CreateMeeting>} and handling creation and
 * preparation of object instances.
 * <p/>
 * Being a {@code MembersInjector<CreateMeeting>} and handling injection
 * of annotated fields.
 */
public final class CreateMeeting$$InjectAdapter extends Binding<CreateMeeting>
        implements Provider<CreateMeeting>, MembersInjector<CreateMeeting> {
    private Binding<com.squareup.otto.Bus> BUS;
    private Binding<android.app.NotificationManager> notificationManager;

    public CreateMeeting$$InjectAdapter() {
        super("com.pxl.android.cemeo.core.CreateMeeting", "members/com.pxl.android.cemeo.core.CreateMeeting", NOT_SINGLETON, CreateMeeting.class);
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
        BUS = (Binding<com.squareup.otto.Bus>) linker.requestBinding("com.squareup.otto.Bus", CreateMeeting.class);
        notificationManager = (Binding<android.app.NotificationManager>) linker.requestBinding("android.app.NotificationManager", CreateMeeting.class);
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
        injectMembersBindings.add(BUS);
        injectMembersBindings.add(notificationManager);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<CreateMeeting>}.
     */
    @Override
    public CreateMeeting get() {
        CreateMeeting result = new CreateMeeting();
        injectMembers(result);
        return result;
    }

    /**
     * Injects any {@code @Inject} annotated fields in the given instance,
     * satisfying the contract for {@code Provider<CreateMeeting>}.
     */
    @Override
    public void injectMembers(CreateMeeting object) {
        object.BUS = BUS.get();
        object.notificationManager = notificationManager.get();
    }
}
