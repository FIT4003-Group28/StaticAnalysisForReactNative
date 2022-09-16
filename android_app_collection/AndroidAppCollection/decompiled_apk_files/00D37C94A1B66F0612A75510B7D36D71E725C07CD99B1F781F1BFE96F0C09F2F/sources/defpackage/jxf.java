package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: jxf  reason: default package */
/* loaded from: classes3.dex */
public final class jxf extends ahyf {
    View a;
    View b;
    public String c;
    public final adoa d;
    public final Set e;
    public final Set f;
    private boolean g;
    private boolean h;
    private final Handler i;

    public jxf(Context context, adoa adoaVar) {
        super(context);
        this.i = new Handler(Looper.getMainLooper());
        this.d = adoaVar;
        this.e = Collections.newSetFromMap(new WeakHashMap());
        this.f = Collections.newSetFromMap(new WeakHashMap());
    }

    private final void l() {
        for (ahin ahinVar : this.e) {
            ahinVar.a(this.g);
        }
    }

    @Override // defpackage.ahyl
    public final View a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.mdx_autoplay_overlay, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.cancel);
        this.a = findViewById;
        findViewById.setOnClickListener(new jxd(this, 1));
        View findViewById2 = inflate.findViewById(R.id.play_now);
        this.b = findViewById2;
        findViewById2.setOnClickListener(new jxd(this));
        return inflate;
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahyl
    public final void d(Context context, View view) {
    }

    public final void g(boolean z) {
        if (this.h == z) {
            return;
        }
        this.h = z;
        for (ahim ahimVar : this.f) {
            ahimVar.F(z);
        }
    }

    @Override // defpackage.ahyf
    public final void kT() {
        super.kT();
        if (!this.g) {
            return;
        }
        this.g = false;
        l();
    }

    @Override // defpackage.ahyf
    public final void kU() {
        super.kU();
        if (this.g) {
            return;
        }
        this.g = true;
        l();
        this.i.postDelayed(new Runnable() { // from class: jxe
            @Override // java.lang.Runnable
            public final void run() {
                jxf jxfVar = jxf.this;
                View view = jxfVar.a;
                if (view != null) {
                    view.requestFocus();
                    jxfVar.a.sendAccessibilityEvent(8);
                }
            }
        }, 300L);
    }

    @Override // defpackage.ahyl
    public final boolean mZ() {
        return true;
    }
}
