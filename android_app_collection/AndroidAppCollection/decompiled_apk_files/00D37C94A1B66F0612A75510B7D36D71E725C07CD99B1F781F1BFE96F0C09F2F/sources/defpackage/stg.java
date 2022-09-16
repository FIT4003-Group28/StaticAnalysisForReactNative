package defpackage;

import com.google.android.libraries.elements.interfaces.ControllerModuleLoader;
import com.google.android.libraries.elements.interfaces.JSController;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import com.google.android.libraries.elements.interfaces.JSEnvironment;
import com.google.android.libraries.elements.interfaces.JSModuleCache;
import java.util.Map;
/* compiled from: PG */
/* renamed from: stg  reason: default package */
/* loaded from: classes4.dex */
public final class stg extends JSEnvironment {
    private volatile JSController a;
    private volatile ControllerModuleLoader b;
    private final thu c;
    private final boolean d;
    private final ste e;
    private final azqb f;
    private final Map g;

    public stg(boolean z, thu thuVar, ste steVar, azqb azqbVar, Map map) {
        this.c = thuVar;
        this.d = z;
        this.e = steVar;
        this.f = azqbVar;
        this.g = map;
    }

    @Override // com.google.android.libraries.elements.interfaces.JSEnvironment
    public final JSController getController() {
        JSController jSController = this.a;
        if (jSController != null) {
            return jSController;
        }
        synchronized (this) {
            if (this.a == null) {
                aohk.c("elements", new String[0]);
                thg thgVar = new thg(this.d, this.c);
                ste steVar = this.e;
                JSControllerConfig jSControllerConfig = new JSControllerConfig(steVar.a, steVar.b, steVar.c);
                JSController create = JSController.create(thgVar.a, (JSModuleCache) this.f.get(), jSControllerConfig);
                if (create != null) {
                    for (sth sthVar : ((amup) this.g).values()) {
                        create.registerFunctionBinding(sthVar.a().a(), sthVar);
                    }
                }
                this.a = create;
            }
        }
        return this.a;
    }

    @Override // com.google.android.libraries.elements.interfaces.JSEnvironment
    public final ControllerModuleLoader getModuleLoader() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b == null) {
                this.b = ((JSModuleCache) this.f.get()).getLoader();
            }
        }
        return this.b;
    }
}
