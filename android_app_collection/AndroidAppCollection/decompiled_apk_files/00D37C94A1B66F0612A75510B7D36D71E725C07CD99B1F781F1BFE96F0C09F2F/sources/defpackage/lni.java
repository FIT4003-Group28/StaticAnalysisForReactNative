package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: lni  reason: default package */
/* loaded from: classes3.dex */
public final class lni extends ContentObserver implements lmu {
    public final aypf b;
    public lnh c;
    public CaptioningManager d;
    private int e;
    private final aitm f;
    private final ArrayList g;
    private AudioManager h;
    private boolean i;

    public lni(Context context, aacz aaczVar, fqd fqdVar, aitm aitmVar) {
        super(new Handler());
        this.g = new ArrayList();
        this.f = aitmVar;
        this.b = new aypf();
        asxj asxjVar = aaczVar.b().e;
        boolean z = (asxjVar == null ? asxj.a : asxjVar).u;
        asxj asxjVar2 = aaczVar.b().e;
        boolean z2 = (asxjVar2 == null ? asxj.a : asxjVar2).t;
        asxj asxjVar3 = aaczVar.b().e;
        boolean z3 = (asxjVar3 == null ? asxj.a : asxjVar3).s;
        boolean z4 = false;
        boolean z5 = z && z2 && z3;
        if (z) {
            this.e = 0;
            this.h = (AudioManager) context.getSystemService("audio");
            this.i = i();
            ContentResolver contentResolver = context.getContentResolver();
            contentResolver.registerContentObserver(Settings.System.CONTENT_URI, true, this);
            fqdVar.g(new lnf(this, contentResolver));
        }
        if (z2) {
            this.e = 1;
            this.c = new lnh(this);
            CaptioningManager captioningManager = (CaptioningManager) context.getSystemService("captioning");
            this.d = captioningManager;
            captioningManager.addCaptioningChangeListener(this.c);
            this.i = h();
            fqdVar.g(new lng(this, z5, 1));
        }
        if (z3) {
            this.e = 2;
            c();
            this.i = g();
            fqdVar.g(new lng(this, z5));
        }
        if (z5) {
            this.e = 3;
            this.i = (h() || g() || i()) ? true : z4;
        }
    }

    public static final void e(fjz fjzVar, aplx aplxVar, boolean z) {
        if (fjzVar == null) {
            return;
        }
        fjzVar.a = z;
        View view = fjzVar.f;
        if (aplxVar == null) {
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        View c = fjzVar.c();
        c.setVisibility(0);
        if (fjzVar.a) {
            c.animate().alpha(1.0f).setDuration(350L).setInterpolator(fjzVar.b).start();
        }
        TextView textView = (TextView) c;
        arag aragVar = aplxVar.b;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        textView.setText(ajgl.b(aragVar));
        arag aragVar2 = aplxVar.b;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        c.setContentDescription(ajgl.i(aragVar2));
    }

    public static final void f(fjz fjzVar) {
        View view;
        if (fjzVar == null || (view = fjzVar.f) == null) {
            return;
        }
        view.setVisibility(8);
    }

    private final boolean g() {
        return ((Boolean) ylx.f(this.f.b(), false)).booleanValue();
    }

    private final boolean h() {
        CaptioningManager captioningManager = this.d;
        return captioningManager != null && captioningManager.isEnabled();
    }

    private final boolean i() {
        AudioManager audioManager = this.h;
        return audioManager != null && audioManager.getStreamVolume(3) == 0;
    }

    @Override // defpackage.lmu
    public final void a(lmt lmtVar) {
        this.g.add(new WeakReference(lmtVar));
    }

    @Override // defpackage.lmu
    public final void b(fjz fjzVar, aplx aplxVar) {
        int i = this.e;
        boolean z = true;
        if (i == 0) {
            z = i();
        } else if (i == 1) {
            z = h();
        } else if (i != 2) {
            if (!h() && !g() && !i()) {
                z = false;
            }
        } else {
            z = g();
        }
        if (!z) {
            f(fjzVar);
        } else {
            e(fjzVar, aplxVar, false);
        }
    }

    public final void c() {
        aynx C;
        aypf aypfVar = this.b;
        aitm aitmVar = this.f;
        if (aitmVar.d.b().booleanValue()) {
            C = aitmVar.a.A().n();
        } else {
            C = aitmVar.c.d().C(ajcg.b);
        }
        aypfVar.d(C.I().G(aypa.a()).n().Z(new ayqb() { // from class: lne
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                ampq ampqVar = (ampq) obj;
                lni.this.d();
            }
        }));
    }

    public final void d() {
        boolean i;
        int i2 = this.e;
        if (i2 == 0) {
            i = i();
        } else if (i2 == 1) {
            i = h();
        } else if (i2 != 2) {
            i = h() || g() || i();
        } else {
            i = g();
        }
        if (i == this.i) {
            return;
        }
        this.i = i;
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            WeakReference weakReference = (WeakReference) arrayList.get(i3);
            if (weakReference.get() != null) {
                if (i) {
                    e(((lmt) weakReference.get()).d(), ((lmt) weakReference.get()).e(), true);
                } else {
                    f(((lmt) weakReference.get()).d());
                }
            }
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        d();
    }
}
