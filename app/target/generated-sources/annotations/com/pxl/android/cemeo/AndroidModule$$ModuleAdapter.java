// Code generated by dagger-compiler.  Do not edit.
package com.pxl.android.cemeo;


import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ModuleAdapter;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

/**
 * A manager of modules and provides adapters allowing for proper linking and
 * instance provision of types served by {@code @Provides} methods.
 */
public final class AndroidModule$$ModuleAdapter extends ModuleAdapter<AndroidModule> {
  private static final String[] INJECTS = { };
  private static final Class<?>[] STATIC_INJECTIONS = { };
  private static final Class<?>[] INCLUDES = { };

  public AndroidModule$$ModuleAdapter() {
    super(INJECTS, STATIC_INJECTIONS, false /*overrides*/, INCLUDES, false /*complete*/, true /*library*/);
  }

  @Override
  protected AndroidModule newModule() {
    return new com.pxl.android.cemeo.AndroidModule();
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getBindings(Map<String, Binding<?>> map) {
    map.put("android.content.Context", new ProvideAppContextProvidesAdapter(module));
    map.put("android.content.SharedPreferences", new ProvideDefaultSharedPreferencesProvidesAdapter(module));
    map.put("android.content.pm.PackageInfo", new ProvidePackageInfoProvidesAdapter(module));
    map.put("android.telephony.TelephonyManager", new ProvideTelephonyManagerProvidesAdapter(module));
    map.put("android.view.inputmethod.InputMethodManager", new ProvideInputMethodManagerProvidesAdapter(module));
    map.put("android.content.pm.ApplicationInfo", new ProvideApplicationInfoProvidesAdapter(module));
    map.put("android.accounts.AccountManager", new ProvideAccountManagerProvidesAdapter(module));
    map.put("java.lang.ClassLoader", new ProvideClassLoaderProvidesAdapter(module));
    map.put("android.app.NotificationManager", new ProvideNotificationManagerProvidesAdapter(module));
  }

  /**
   * A {@code Binder<android.content.Context>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Being a {@code Provider<android.content.Context>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideAppContextProvidesAdapter extends Binding<android.content.Context>
      implements Provider<android.content.Context> {
    private final AndroidModule module;

    public ProvideAppContextProvidesAdapter(AndroidModule module) {
      super("android.content.Context", null, IS_SINGLETON, "com.pxl.android.cemeo.AndroidModule.provideAppContext()");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<android.content.Context>}.
     */
    @Override
    public android.content.Context get() {
      return module.provideAppContext();
    }
  }

  /**
   * A {@code Binder<android.content.SharedPreferences>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Owning the dependency links between {@code android.content.SharedPreferences} and its
   * dependencies.
   * 
   * Being a {@code Provider<android.content.SharedPreferences>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideDefaultSharedPreferencesProvidesAdapter extends Binding<android.content.SharedPreferences>
      implements Provider<android.content.SharedPreferences> {
    private final AndroidModule module;
    private Binding<android.content.Context> context;

    public ProvideDefaultSharedPreferencesProvidesAdapter(AndroidModule module) {
      super("android.content.SharedPreferences", null, NOT_SINGLETON, "com.pxl.android.cemeo.AndroidModule.provideDefaultSharedPreferences()");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      context = (Binding<android.content.Context>) linker.requestBinding("android.content.Context", AndroidModule.class);
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(context);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<android.content.SharedPreferences>}.
     */
    @Override
    public android.content.SharedPreferences get() {
      return module.provideDefaultSharedPreferences(context.get());
    }
  }

  /**
   * A {@code Binder<android.content.pm.PackageInfo>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Owning the dependency links between {@code android.content.pm.PackageInfo} and its
   * dependencies.
   * 
   * Being a {@code Provider<android.content.pm.PackageInfo>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvidePackageInfoProvidesAdapter extends Binding<android.content.pm.PackageInfo>
      implements Provider<android.content.pm.PackageInfo> {
    private final AndroidModule module;
    private Binding<android.content.Context> context;

    public ProvidePackageInfoProvidesAdapter(AndroidModule module) {
      super("android.content.pm.PackageInfo", null, NOT_SINGLETON, "com.pxl.android.cemeo.AndroidModule.providePackageInfo()");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      context = (Binding<android.content.Context>) linker.requestBinding("android.content.Context", AndroidModule.class);
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(context);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<android.content.pm.PackageInfo>}.
     */
    @Override
    public android.content.pm.PackageInfo get() {
      return module.providePackageInfo(context.get());
    }
  }

  /**
   * A {@code Binder<android.telephony.TelephonyManager>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Owning the dependency links between {@code android.telephony.TelephonyManager} and its
   * dependencies.
   * 
   * Being a {@code Provider<android.telephony.TelephonyManager>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideTelephonyManagerProvidesAdapter extends Binding<android.telephony.TelephonyManager>
      implements Provider<android.telephony.TelephonyManager> {
    private final AndroidModule module;
    private Binding<android.content.Context> context;

    public ProvideTelephonyManagerProvidesAdapter(AndroidModule module) {
      super("android.telephony.TelephonyManager", null, NOT_SINGLETON, "com.pxl.android.cemeo.AndroidModule.provideTelephonyManager()");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      context = (Binding<android.content.Context>) linker.requestBinding("android.content.Context", AndroidModule.class);
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(context);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<android.telephony.TelephonyManager>}.
     */
    @Override
    public android.telephony.TelephonyManager get() {
      return module.provideTelephonyManager(context.get());
    }
  }

  /**
   * A {@code Binder<android.view.inputmethod.InputMethodManager>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Owning the dependency links between {@code android.view.inputmethod.InputMethodManager} and its
   * dependencies.
   * 
   * Being a {@code Provider<android.view.inputmethod.InputMethodManager>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideInputMethodManagerProvidesAdapter extends Binding<android.view.inputmethod.InputMethodManager>
      implements Provider<android.view.inputmethod.InputMethodManager> {
    private final AndroidModule module;
    private Binding<android.content.Context> context;

    public ProvideInputMethodManagerProvidesAdapter(AndroidModule module) {
      super("android.view.inputmethod.InputMethodManager", null, NOT_SINGLETON, "com.pxl.android.cemeo.AndroidModule.provideInputMethodManager()");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      context = (Binding<android.content.Context>) linker.requestBinding("android.content.Context", AndroidModule.class);
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(context);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<android.view.inputmethod.InputMethodManager>}.
     */
    @Override
    public android.view.inputmethod.InputMethodManager get() {
      return module.provideInputMethodManager(context.get());
    }
  }

  /**
   * A {@code Binder<android.content.pm.ApplicationInfo>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Owning the dependency links between {@code android.content.pm.ApplicationInfo} and its
   * dependencies.
   * 
   * Being a {@code Provider<android.content.pm.ApplicationInfo>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideApplicationInfoProvidesAdapter extends Binding<android.content.pm.ApplicationInfo>
      implements Provider<android.content.pm.ApplicationInfo> {
    private final AndroidModule module;
    private Binding<android.content.Context> context;

    public ProvideApplicationInfoProvidesAdapter(AndroidModule module) {
      super("android.content.pm.ApplicationInfo", null, NOT_SINGLETON, "com.pxl.android.cemeo.AndroidModule.provideApplicationInfo()");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      context = (Binding<android.content.Context>) linker.requestBinding("android.content.Context", AndroidModule.class);
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(context);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<android.content.pm.ApplicationInfo>}.
     */
    @Override
    public android.content.pm.ApplicationInfo get() {
      return module.provideApplicationInfo(context.get());
    }
  }

  /**
   * A {@code Binder<android.accounts.AccountManager>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Owning the dependency links between {@code android.accounts.AccountManager} and its
   * dependencies.
   * 
   * Being a {@code Provider<android.accounts.AccountManager>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideAccountManagerProvidesAdapter extends Binding<android.accounts.AccountManager>
      implements Provider<android.accounts.AccountManager> {
    private final AndroidModule module;
    private Binding<android.content.Context> context;

    public ProvideAccountManagerProvidesAdapter(AndroidModule module) {
      super("android.accounts.AccountManager", null, NOT_SINGLETON, "com.pxl.android.cemeo.AndroidModule.provideAccountManager()");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      context = (Binding<android.content.Context>) linker.requestBinding("android.content.Context", AndroidModule.class);
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(context);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<android.accounts.AccountManager>}.
     */
    @Override
    public android.accounts.AccountManager get() {
      return module.provideAccountManager(context.get());
    }
  }

  /**
   * A {@code Binder<java.lang.ClassLoader>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Owning the dependency links between {@code java.lang.ClassLoader} and its
   * dependencies.
   * 
   * Being a {@code Provider<java.lang.ClassLoader>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideClassLoaderProvidesAdapter extends Binding<ClassLoader>
      implements Provider<ClassLoader> {
    private final AndroidModule module;
    private Binding<android.content.Context> context;

    public ProvideClassLoaderProvidesAdapter(AndroidModule module) {
      super("java.lang.ClassLoader", null, NOT_SINGLETON, "com.pxl.android.cemeo.AndroidModule.provideClassLoader()");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      context = (Binding<android.content.Context>) linker.requestBinding("android.content.Context", AndroidModule.class);
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(context);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<java.lang.ClassLoader>}.
     */
    @Override
    public ClassLoader get() {
      return module.provideClassLoader(context.get());
    }
  }

  /**
   * A {@code Binder<android.app.NotificationManager>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Owning the dependency links between {@code android.app.NotificationManager} and its
   * dependencies.
   * 
   * Being a {@code Provider<android.app.NotificationManager>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideNotificationManagerProvidesAdapter extends Binding<android.app.NotificationManager>
      implements Provider<android.app.NotificationManager> {
    private final AndroidModule module;
    private Binding<android.content.Context> context;

    public ProvideNotificationManagerProvidesAdapter(AndroidModule module) {
      super("android.app.NotificationManager", null, NOT_SINGLETON, "com.pxl.android.cemeo.AndroidModule.provideNotificationManager()");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      context = (Binding<android.content.Context>) linker.requestBinding("android.content.Context", AndroidModule.class);
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(context);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<android.app.NotificationManager>}.
     */
    @Override
    public android.app.NotificationManager get() {
      return module.provideNotificationManager(context.get());
    }
  }
}
