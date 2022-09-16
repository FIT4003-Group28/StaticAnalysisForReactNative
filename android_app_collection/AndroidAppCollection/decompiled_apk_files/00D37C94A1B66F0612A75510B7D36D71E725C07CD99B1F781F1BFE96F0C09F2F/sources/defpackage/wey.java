package defpackage;
/* compiled from: PG */
/* renamed from: wey  reason: default package */
/* loaded from: classes4.dex */
public final class wey {
    public static ambp a(afvm afvmVar) {
        aopc aopcVar = (aopc) ambp.a.createBuilder();
        String b = b(afvmVar);
        aopcVar.copyOnWrite();
        ambp ambpVar = (ambp) aopcVar.instance;
        ambpVar.b |= 256;
        ambpVar.i = b;
        String c = c(afvmVar);
        aopcVar.copyOnWrite();
        ambp ambpVar2 = (ambp) aopcVar.instance;
        ambpVar2.b |= 1;
        ambpVar2.c = c;
        return (ambp) aopcVar.mo39build();
    }

    public static String b(afvm afvmVar) {
        return afvmVar.y() ? "pseudonymous" : afvmVar.x() ? "youtube-delegated" : afvmVar.g() ? "youtube-incognito" : "youtube-direct";
    }

    public static String c(afvm afvmVar) {
        return afvmVar.b().equals("") ? "pseudonymous" : afvmVar.b();
    }
}
