package defpackage;
/* compiled from: PG */
/* renamed from: cvoj  reason: default package */
/* loaded from: classes5.dex */
public final class cvoj extends cvon {
    public String a;
    public String b;
    public int c;

    @Override // defpackage.cvon
    public final void a(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null group");
    }
}
