package defpackage;
/* compiled from: PG */
/* renamed from: ajmc  reason: default package */
/* loaded from: classes.dex */
public final class ajmc implements tex {
    @Override // defpackage.tex
    public final aooq a() {
        return avjx.b;
    }

    @Override // defpackage.tex
    public final /* bridge */ /* synthetic */ void b(cyv cyvVar, Object obj, tew tewVar) {
        avjx avjxVar = (avjx) obj;
        if (!avjxVar.d) {
            return;
        }
        akej a = akej.a(cyvVar.b);
        a.b = tewVar.d;
        int i = avjxVar.c;
        if ((i & 2) != 0) {
            a.a = avjxVar.e;
        }
        if ((i & 4) != 0) {
            a.c(avjxVar.f);
        }
        tewVar.d = a.b();
    }
}
