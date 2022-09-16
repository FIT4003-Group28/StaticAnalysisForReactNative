package defpackage;
/* compiled from: PG */
/* renamed from: cwfn  reason: default package */
/* loaded from: classes.dex */
public final class cwfn {
    public static final /* bridge */ /* synthetic */ cvug e(Object obj) {
        cwfm cwfmVar = (cwfm) obj;
        cvuc cvucVar = new cvuc();
        cvucVar.a(false);
        cvucVar.b(1);
        cvucVar.a(cwfmVar.e());
        cvucVar.b(cwfmVar.i());
        String str = cvucVar.a == null ? " isG1User" : "";
        if (cvucVar.b == 0) {
            str = str.concat(" isUnicornUser");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cvud(cvucVar.a.booleanValue(), cvucVar.b);
    }

    public static final /* bridge */ /* synthetic */ void f(Object obj) {
        cwfm cwfmVar = (cwfm) obj;
    }
}
