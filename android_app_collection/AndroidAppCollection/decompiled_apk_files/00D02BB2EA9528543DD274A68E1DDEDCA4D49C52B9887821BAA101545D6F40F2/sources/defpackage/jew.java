package defpackage;
/* compiled from: PG */
/* renamed from: jew  reason: default package */
/* loaded from: classes7.dex */
final class jew extends jev {
    private volatile transient cqtd h;
    private volatile transient cqtd i;
    private volatile transient cqtd j;

    public jew(boolean z, boolean z2, int i, int i2, int i3, dbsg<cqtv> dbsgVar, cqtv cqtvVar) {
        super(z, z2, i, i2, i3, dbsgVar, cqtvVar);
    }

    @Override // defpackage.jfo
    public final cqtd i() {
        if (this.h == null) {
            synchronized (this) {
                if (this.h == null) {
                    this.h = l(this.a);
                    if (this.h == null) {
                        throw new NullPointerException("getDrawableStar() cannot return null");
                    }
                }
            }
        }
        return this.h;
    }

    @Override // defpackage.jfo
    public final cqtd j() {
        if (this.i == null) {
            synchronized (this) {
                if (this.i == null) {
                    this.i = l(this.c);
                    if (this.i == null) {
                        throw new NullPointerException("getDrawableStarHalf() cannot return null");
                    }
                }
            }
        }
        return this.i;
    }

    @Override // defpackage.jfo
    public final cqtd k() {
        if (this.j == null) {
            synchronized (this) {
                if (this.j == null) {
                    this.j = l(this.b);
                    if (this.j == null) {
                        throw new NullPointerException("getDrawableStarEmpty() cannot return null");
                    }
                }
            }
        }
        return this.j;
    }
}
