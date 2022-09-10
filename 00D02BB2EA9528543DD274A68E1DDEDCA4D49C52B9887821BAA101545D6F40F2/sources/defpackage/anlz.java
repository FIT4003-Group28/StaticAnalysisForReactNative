package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: anlz  reason: default package */
/* loaded from: classes2.dex */
public final class anlz {
    public static final dcqe a = dcqe.c("anlz");
    public static final dbsl<dvay> b = new anly();
    public final ckcw c;
    public final anlm d;
    public dbsg<? extends Map<aogb, aoge>> e = dbpy.a;
    public dbsg<ckgm> f = dbpy.a;
    public dbsg<dnrw> g = dbpy.a;
    public boolean h = false;

    public anlz(ckcw ckcwVar, anlm anlmVar) {
        this.c = ckcwVar;
        this.d = anlmVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(aogb aogbVar) {
        if (!this.e.a()) {
            return;
        }
        this.e.b().remove(aogbVar);
        if (!this.e.b().isEmpty()) {
            return;
        }
        b();
    }

    public final void b() {
        this.e = dbpy.a;
        this.f = dbpy.a;
        this.h = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(int i) {
        ((ckco) this.c.a(ckgo.c)).a(i - 1);
    }
}
