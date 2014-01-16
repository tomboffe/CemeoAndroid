// Code generated by dagger-compiler.  Do not edit.
package com.pxl.android.cemeo.ui;


import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

/**
 * A {@code Binder<CreateMeetingFragment>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 * 
 * Owning the dependency links between {@code CreateMeetingFragment} and its
 * dependencies.
 * 
 * Being a {@code Provider<CreateMeetingFragment>} and handling creation and
 * preparation of object instances.
 * 
 * Being a {@code MembersInjector<CreateMeetingFragment>} and handling injection
 * of annotated fields.
 */
public final class CreateMeetingFragment$$InjectAdapter extends Binding<CreateMeetingFragment>
    implements Provider<CreateMeetingFragment>, MembersInjector<CreateMeetingFragment> {
  private Binding<com.pxl.android.cemeo.BootstrapServiceProvider> serviceProvider;
  private Binding<com.pxl.android.cemeo.authenticator.LogoutService> logoutService;
  private Binding<ItemListFragment> supertype;

  public CreateMeetingFragment$$InjectAdapter() {
    super("com.pxl.android.cemeo.ui.CreateMeetingFragment", "members/com.pxl.android.cemeo.ui.CreateMeetingFragment", NOT_SINGLETON, CreateMeetingFragment.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    serviceProvider = (Binding<com.pxl.android.cemeo.BootstrapServiceProvider>) linker.requestBinding("com.pxl.android.cemeo.BootstrapServiceProvider", CreateMeetingFragment.class);
    logoutService = (Binding<com.pxl.android.cemeo.authenticator.LogoutService>) linker.requestBinding("com.pxl.android.cemeo.authenticator.LogoutService", CreateMeetingFragment.class);
    supertype = (Binding<ItemListFragment>) linker.requestBinding("members/com.pxl.android.cemeo.ui.ItemListFragment", CreateMeetingFragment.class, false, true);
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
    injectMembersBindings.add(serviceProvider);
    injectMembersBindings.add(logoutService);
    injectMembersBindings.add(supertype);
  }

  /**
   * Returns the fully provisioned instance satisfying the contract for
   * {@code Provider<CreateMeetingFragment>}.
   */
  @Override
  public CreateMeetingFragment get() {
    CreateMeetingFragment result = new CreateMeetingFragment();
    injectMembers(result);
    return result;
  }

  /**
   * Injects any {@code @Inject} annotated fields in the given instance,
   * satisfying the contract for {@code Provider<CreateMeetingFragment>}.
   */
  @Override
  public void injectMembers(CreateMeetingFragment object) {
    object.serviceProvider = serviceProvider.get();
    object.logoutService = logoutService.get();
    supertype.injectMembers(object);
  }
}
