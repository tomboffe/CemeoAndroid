// Code generated by dagger-compiler.  Do not edit.
package com.pxl.android.cemeo.gcm.sender;


import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

/**
 * A {@code Binder<GCMSenderImpl>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 * 
 * Owning the dependency links between {@code GCMSenderImpl} and its
 * dependencies.
 * 
 * Being a {@code Provider<GCMSenderImpl>} and handling creation and
 * preparation of object instances.
 * 
 * Being a {@code MembersInjector<GCMSenderImpl>} and handling injection
 * of annotated fields.
 */
public final class GCMSenderImpl$$InjectAdapter extends Binding<GCMSenderImpl>
    implements MembersInjector<GCMSenderImpl> {
  private Binding<com.pxl.android.cemeo.core.BootstrapService> bs;

  public GCMSenderImpl$$InjectAdapter() {
    super(null, "members/com.pxl.android.cemeo.gcm.sender.GCMSenderImpl", NOT_SINGLETON, GCMSenderImpl.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    bs = (Binding<com.pxl.android.cemeo.core.BootstrapService>) linker.requestBinding("com.pxl.android.cemeo.core.BootstrapService", GCMSenderImpl.class);
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
    injectMembersBindings.add(bs);
  }

  /**
   * Injects any {@code @Inject} annotated fields in the given instance,
   * satisfying the contract for {@code Provider<GCMSenderImpl>}.
   */
  @Override
  public void injectMembers(GCMSenderImpl object) {
    object.bs = bs.get();
  }
}
