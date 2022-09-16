package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hkf  reason: default package */
/* loaded from: classes3.dex */
public final class hkf implements akyv {
    private static void c(String str) {
        String valueOf = String.valueOf(str);
        afus.b(2, 6, valueOf.length() != 0 ? "[ShortsCreation][Android][Upload]".concat(valueOf) : new String("[ShortsCreation][Android][Upload]"));
    }

    @Override // defpackage.akyv
    public final void a(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35);
        sb.append("Current executing flow failed for ");
        sb.append(str);
        sb.append(".");
        c(sb.toString());
    }

    @Override // defpackage.akyv
    public final void b(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28);
        sb.append("Upload creation failed for ");
        sb.append(str);
        sb.append(".");
        c(sb.toString());
    }
}
