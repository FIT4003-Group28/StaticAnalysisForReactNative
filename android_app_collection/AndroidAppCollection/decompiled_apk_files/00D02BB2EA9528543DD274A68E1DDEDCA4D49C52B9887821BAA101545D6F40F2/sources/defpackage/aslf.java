package defpackage;
/* compiled from: PG */
/* renamed from: aslf  reason: default package */
/* loaded from: classes2.dex */
public class aslf {
    public final asld a;
    @dzsi
    public final Float b;
    public final boolean c;
    public final boolean d;

    /* JADX INFO: Access modifiers changed from: protected */
    public aslf(asle<?> asleVar) {
        asld asldVar = asleVar.a;
        dbsk.s(asldVar);
        this.a = asldVar;
        this.b = asleVar.b;
        this.c = asleVar.c;
        this.d = asleVar.d;
    }

    @dzsi
    public final Float a() {
        if (this.a.b()) {
            return this.b;
        }
        return null;
    }

    public asle<?> b() {
        return new asle<>(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public dbsb c() {
        dbsb b = dbsc.b(this);
        b.b("cameraMode", this.a);
        b.b("zoomOverride", this.b);
        b.h("skipCameraAnimations", this.c);
        b.h("forceNorthUp", this.d);
        return b;
    }

    public final String toString() {
        return c().toString();
    }
}
