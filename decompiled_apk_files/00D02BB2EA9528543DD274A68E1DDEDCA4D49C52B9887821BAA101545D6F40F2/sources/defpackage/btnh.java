package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: btnh  reason: default package */
/* loaded from: classes.dex */
public abstract class btnh<T> implements btni {
    public static volatile btmv b;
    private final List<T> a;
    protected int c;
    @dzsi
    private final btmk d;
    @dzsi
    private final btmv e;
    private final String f;
    private boolean g;
    private final btng h;

    public btnh(int i, @dzsi btmv btmvVar, btng btngVar, String str) {
        this.a = dchl.a();
        this.g = false;
        this.c = i;
        this.h = btngVar;
        if (btmvVar != null) {
            this.e = btmvVar;
        } else {
            this.e = b;
        }
        if (!str.isEmpty()) {
            String str2 = btngVar.l;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2 + String.valueOf(str).length());
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            this.f = sb.toString();
        } else {
            this.f = btngVar.l;
        }
        ckcw ckcwVar = btmvVar == null ? null : btmvVar.c;
        if (ckcwVar != null) {
            this.d = new btml(ckcwVar).b(btngVar.m, btng.ALL_OBJECT_POOL.m, ckip.S, ckip.T);
        } else {
            this.d = null;
        }
    }

    protected abstract T a();

    @Override // defpackage.btni
    public final synchronized int b(float f) {
        return g(this.a, f);
    }

    @Override // defpackage.btni
    public final synchronized String c() {
        StringBuilder sb;
        int size = this.a.size();
        sb = new StringBuilder(17);
        sb.append("size: ");
        sb.append(size);
        return sb.toString();
    }

    public final synchronized T d() {
        int size;
        size = this.a.size();
        btmk btmkVar = this.d;
        if (btmkVar != null) {
            if (size != 0) {
                btmkVar.a();
            } else {
                btmkVar.b();
            }
        }
        return size == 0 ? a() : this.a.remove(size - 1);
    }

    protected final synchronized void e(List<T> list, T t) {
        btmv btmvVar;
        if (!this.g && (btmvVar = this.e) != null) {
            btmvVar.a(this, this.f);
            this.g = true;
        }
        list.add(t);
    }

    public final synchronized void f() {
        b(0.0f);
    }

    protected final synchronized <T> int g(List<T> list, float f) {
        int size;
        int i;
        size = list.size();
        i = (int) (f * size);
        while (list.size() > i) {
            list.remove(list.size() - 1);
        }
        if (this.g && this.a.isEmpty()) {
            btmv btmvVar = this.e;
            if (btmvVar != null) {
                btmvVar.d(this);
            }
            this.g = false;
        }
        return size - i;
    }

    public final synchronized void h(T t) {
        if (this.a.size() >= this.c) {
            return;
        }
        e(this.a, t);
    }

    public final synchronized String toString() {
        StringBuilder sb;
        String str = this.f;
        int size = this.a.size();
        int i = this.c;
        sb = new StringBuilder(String.valueOf(str).length() + 43);
        sb.append("ObjectPool[name: ");
        sb.append(str);
        sb.append("; ");
        sb.append(size);
        sb.append("/");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    public btnh(int i, String str) {
        this(i, null, btng.OTHER, str);
    }

    public btnh(btmv btmvVar, btng btngVar) {
        this(256, btmvVar, btngVar, "");
    }
}
