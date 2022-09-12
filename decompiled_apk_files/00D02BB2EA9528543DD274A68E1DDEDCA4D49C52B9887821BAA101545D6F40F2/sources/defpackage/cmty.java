package defpackage;
/* compiled from: PG */
/* renamed from: cmty  reason: default package */
/* loaded from: classes5.dex */
public final class cmty {
    public int a = 1;

    public final void a(boolean z) {
        this.a = (this.a * 31) + (z ? 1 : 0);
    }

    public final void b(Object obj) {
        this.a = (this.a * 31) + (obj == null ? 0 : obj.hashCode());
    }
}
