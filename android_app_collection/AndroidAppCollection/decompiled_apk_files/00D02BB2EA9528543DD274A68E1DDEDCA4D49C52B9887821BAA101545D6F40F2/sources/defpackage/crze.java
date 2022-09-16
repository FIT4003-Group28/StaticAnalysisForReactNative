package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: crze  reason: default package */
/* loaded from: classes.dex */
public final class crze extends ThreadLocal<crzk> {
    final /* synthetic */ crzg a;

    public crze(crzg crzgVar) {
        this.a = crzgVar;
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ crzk initialValue() {
        return new crzk(this.a);
    }
}
