package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: vvb  reason: default package */
/* loaded from: classes4.dex */
public abstract class vvb implements Comparable {
    public final int a;
    public boolean b;

    /* JADX INFO: Access modifiers changed from: protected */
    public vvb(int i) {
        this.a = i;
    }

    public abstract int a();

    public abstract void b();

    public abstract void c(Exception exc);

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return ((vvb) obj).a - this.a;
    }

    public abstract int d();

    public abstract void e(int i, Bitmap bitmap);

    public abstract boolean f(int i);
}
