package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.model.WatchDescriptor;
/* compiled from: PG */
/* renamed from: mda  reason: default package */
/* loaded from: classes3.dex */
public final class mda {
    public final ggt a;
    public final mdh b;
    public boolean c;
    public boolean d = true;
    private final fer e;
    private PlaybackStartDescriptor f;

    public mda(fer ferVar, mdh mdhVar, ggt ggtVar) {
        mdhVar.getClass();
        this.b = mdhVar;
        ferVar.getClass();
        this.e = ferVar;
        this.a = ggtVar;
        c();
    }

    public final PlaybackStartDescriptor a() {
        if (this.f == null) {
            aijl d = PlaybackStartDescriptor.d();
            d.a = this.a.b();
            this.f = d.a();
        }
        return this.f;
    }

    public final void b(int i, boolean z) {
        if (this.c) {
            this.b.r();
        } else if (this.a.f() == null) {
        } else {
            boolean z2 = i == 1 || i == 0;
            String f = this.a.f();
            aijl e = a().e();
            fep b = this.e.b(f);
            if (b != null) {
                long j = b.a;
                if (j > 0) {
                    e.k = j;
                }
            }
            e.f = z2;
            e.e = z;
            e.d();
            this.f = e.a();
            WatchDescriptor watchDescriptor = new WatchDescriptor(this.f);
            ggt ggtVar = this.a;
            mdh mdhVar = this.b;
            ezt b2 = ezu.b();
            b2.f(watchDescriptor);
            ezu a = b2.a();
            ggtVar.m();
            mdhVar.v(a);
            this.c = true;
        }
    }

    public final void c() {
        this.c = false;
    }

    public final boolean d() {
        return TextUtils.equals(this.b.m(), this.a.f());
    }
}
