package defpackage;
/* compiled from: PG */
/* renamed from: jeu  reason: default package */
/* loaded from: classes3.dex */
final class jeu implements yiw {
    final /* synthetic */ jev a;

    public jeu(jev jevVar) {
        this.a = jevVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        String valueOf = String.valueOf((String) obj);
        zep.d(valueOf.length() != 0 ? "Failed to sync playlist for playlistId = ".concat(valueOf) : new String("Failed to sync playlist for playlistId = "), exc);
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        String str = (String) obj;
        Boolean bool = (Boolean) obj2;
        boolean z = true;
        if (this.a.s.b().booleanValue()) {
            jff jffVar = this.a.x;
            if (jffVar == null) {
                return;
            }
            if (bool == null || !bool.booleanValue()) {
                z = false;
            }
            jffVar.a(Boolean.valueOf(z));
            agqg d = ((agrf) jffVar.e.get()).a().i().d(jffVar.h);
            if (d == null) {
                return;
            }
            if (!jffVar.r) {
                jffVar.b(d.a);
            }
            jffVar.e();
            return;
        }
        jfa jfaVar = this.a.w;
        if (jfaVar == null) {
            return;
        }
        if (bool == null || !bool.booleanValue()) {
            z = false;
        }
        jfaVar.b(Boolean.valueOf(z));
        agqg d2 = ((agrf) jfaVar.e.get()).a().i().d(jfaVar.h);
        if (d2 == null) {
            return;
        }
        if (!jfaVar.r) {
            jfaVar.c(d2.a);
        }
        jfaVar.h();
    }
}
