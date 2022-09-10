package defpackage;

import android.app.Application;
import com.google.ar.sceneform.rendering.Material;
import java.util.concurrent.CompletableFuture;
/* compiled from: PG */
/* renamed from: duz  reason: default package */
/* loaded from: classes6.dex */
public final class duz {
    private final Application a;

    public duz(Application application) {
        this.a = application;
    }

    public final CompletableFuture<Material> a(int i) {
        dbfx f = Material.f();
        f.c(this.a, i);
        return f.a();
    }
}
