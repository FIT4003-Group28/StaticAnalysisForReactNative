package defpackage;
/* compiled from: PG */
/* renamed from: clde  reason: default package */
/* loaded from: classes5.dex */
public final class clde implements deqn<cldd> {
    public static final clde a = new clde();

    private clde() {
    }

    @Override // defpackage.deql
    public final /* bridge */ /* synthetic */ void a(Object obj, deqo deqoVar) {
        cldd clddVar = (cldd) obj;
        deqw deqwVar = (deqw) deqoVar;
        deqwVar.f("sdkVersion", clddVar.a());
        deqwVar.f("model", clddVar.b());
        deqwVar.f("hardware", clddVar.c());
        deqwVar.f("device", clddVar.d());
        deqwVar.f("product", clddVar.e());
        deqwVar.f("osBuild", clddVar.f());
        deqwVar.f("manufacturer", clddVar.g());
        deqwVar.f("fingerprint", clddVar.h());
    }
}
