package defpackage;

import android.net.Uri;
import com.google.android.apps.maps.R;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bbze  reason: default package */
/* loaded from: classes3.dex */
public class bbze implements bbye {
    private final bbtj a;
    private final bbyg b;
    private final bcan c;
    private final Runnable d;
    private final Runnable e;
    private final gga f;
    private boolean g = true;

    public bbze(bbtj bbtjVar, bbyg bbygVar, bcan bcanVar, Runnable runnable, Runnable runnable2, gga ggaVar) {
        this.a = bbtjVar;
        this.b = bbygVar;
        this.c = bcanVar;
        this.d = runnable;
        this.e = runnable2;
        this.f = ggaVar;
    }

    private final int j() {
        dcdc<bbtm> m = this.c.m();
        Uri a = this.a.a();
        int size = m.size();
        int i = 0;
        while (i < size && !m.get(i).z().equals(a)) {
            i++;
        }
        return size - i;
    }

    @Override // defpackage.bbye
    public String a() {
        return this.a.a().toString();
    }

    @Override // defpackage.bbye
    public Integer b() {
        return this.b.r();
    }

    @Override // defpackage.bbye
    public Boolean c() {
        return Boolean.valueOf(this.c.q(this.a));
    }

    @Override // defpackage.bbye
    public Boolean d() {
        return Boolean.valueOf(this.a.b().equals(bbti.VIDEO));
    }

    @Override // defpackage.bbye
    public cqkl e() {
        this.d.run();
        return cqkl.a;
    }

    @Override // defpackage.bbye
    public cqkl f() {
        this.e.run();
        return cqkl.a;
    }

    @Override // defpackage.bbye
    public CharSequence g() {
        return this.f.getResources().getString(R.string.PHOTO_ACCESSIBILITY_SELECT_THUMB_N_OF_M, Integer.valueOf(j()), Integer.valueOf(this.c.m().size()));
    }

    @Override // defpackage.bbye
    public CharSequence h() {
        if (this.g) {
            return this.f.getResources().getString(R.string.NAVIGATE_UP);
        }
        return this.f.getResources().getString(R.string.PHOTO_ACCESSIBILITY_EXPAND_THUMB_N_OF_M, Integer.valueOf(j()), Integer.valueOf(this.c.m().size()));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{bbze.class, this.a.q()});
    }

    public void i(boolean z) {
        this.g = false;
    }
}
