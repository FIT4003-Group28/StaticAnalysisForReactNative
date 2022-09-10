package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: cmwh  reason: default package */
/* loaded from: classes.dex */
public class cmwh extends cmwf {
    boolean A;
    boolean B;
    fp z;
    final o y = new o(this);
    boolean C = true;

    private static String m(View view) {
        String str;
        StringBuilder sb = new StringBuilder(128);
        sb.append(view.getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(view)));
        sb.append(' ');
        int visibility = view.getVisibility();
        char c = 'V';
        char c2 = '.';
        if (visibility == 0) {
            sb.append('V');
        } else if (visibility == 4) {
            sb.append('I');
        } else if (visibility == 8) {
            sb.append('G');
        } else {
            sb.append('.');
        }
        char c3 = 'F';
        sb.append(true != view.isFocusable() ? '.' : 'F');
        sb.append(true != view.isEnabled() ? '.' : 'E');
        sb.append(true != view.willNotDraw() ? 'D' : '.');
        sb.append(true != view.isHorizontalScrollBarEnabled() ? '.' : 'H');
        if (true != view.isVerticalScrollBarEnabled()) {
            c = '.';
        }
        sb.append(c);
        sb.append(true != view.isClickable() ? '.' : 'C');
        sb.append(true != view.isLongClickable() ? '.' : 'L');
        sb.append(' ');
        if (true != view.isFocused()) {
            c3 = '.';
        }
        sb.append(c3);
        sb.append(true != view.isSelected() ? '.' : 'S');
        if (true == view.isPressed()) {
            c2 = 'P';
        }
        sb.append(c2);
        sb.append(' ');
        sb.append(view.getLeft());
        sb.append(',');
        sb.append(view.getTop());
        sb.append('-');
        sb.append(view.getRight());
        sb.append(',');
        sb.append(view.getBottom());
        int id = view.getId();
        if (id != -1) {
            sb.append(" #");
            sb.append(Integer.toHexString(id));
            Resources resources = view.getResources();
            if (id != 0 && resources != null) {
                int i = (-16777216) & id;
                if (i == 16777216) {
                    str = "android";
                } else if (i != 2130706432) {
                    try {
                        str = resources.getResourcePackageName(id);
                    } catch (Resources.NotFoundException unused) {
                    }
                } else {
                    str = "app";
                }
                String resourceTypeName = resources.getResourceTypeName(id);
                String resourceEntryName = resources.getResourceEntryName(id);
                sb.append(" ");
                sb.append(str);
                sb.append(":");
                sb.append(resourceTypeName);
                sb.append("/");
                sb.append(resourceEntryName);
            }
        }
        sb.append("}");
        return sb.toString();
    }

    private final void n(String str, PrintWriter printWriter, View view) {
        ViewGroup viewGroup;
        int childCount;
        printWriter.print(str);
        if (view == null) {
            printWriter.println("null");
            return;
        }
        printWriter.println(m(view));
        if (!(view instanceof ViewGroup) || (childCount = (viewGroup = (ViewGroup) view).getChildCount()) <= 0) {
            return;
        }
        String concat = String.valueOf(str).concat("  ");
        for (int i = 0; i < childCount; i++) {
            n(concat, printWriter, viewGroup.getChildAt(i));
        }
    }

    private final void p() {
        do {
        } while (q(this.z.b(), j.CREATED));
    }

    private static boolean q(gn gnVar, j jVar) {
        boolean z = false;
        for (fd fdVar : gnVar.q()) {
            if (fdVar != null) {
                if (fdVar.Rm() != null) {
                    z |= q(fdVar.R(), jVar);
                }
                if (fdVar.Z.a.a(j.STARTED)) {
                    fdVar.Z.d(jVar);
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // defpackage.cmvs, defpackage.cmvt
    public final void B(Context context) {
        attachBaseContext(context);
        this.z = fp.a(new cmwg(this, this));
    }

    @Override // defpackage.cmvs, defpackage.cmvt
    public final void E() {
        this.z.o();
    }

    @Override // defpackage.cmvs, defpackage.cmvt
    public final void H() {
        this.y.e(i.ON_RESUME);
        this.z.j();
    }

    @Override // defpackage.cmwf, defpackage.cmvs, defpackage.cmvt
    public void Oe(Bundle bundle) {
        super.Oe(bundle);
        p();
        this.y.e(i.ON_STOP);
        Parcelable e = this.z.e();
        if (e != null) {
            bundle.putParcelable("android:support:fragments", e);
        }
    }

    @Override // defpackage.cmwf, defpackage.cmvs, defpackage.cmvt
    public void e(Bundle bundle) {
        if (getBaseContext() != null) {
            this.z.p();
            if (Ok().getFactory() == null) {
                Ok().setFactory(this);
            }
            if (bundle != null) {
                this.z.f(bundle.getParcelable("android:support:fragments"));
            }
            super.e(bundle);
            this.y.e(i.ON_CREATE);
            this.z.g();
            return;
        }
        throw new IllegalStateException("Context not attached to CarActivity");
    }

    @Override // defpackage.cmwf, defpackage.cmvs, defpackage.cmvt
    public void f() {
        super.f();
        this.C = false;
        if (!this.A) {
            this.A = true;
            this.z.h();
        }
        this.z.d();
        this.z.q();
        this.y.e(i.ON_START);
        this.z.i();
    }

    @Override // defpackage.cmwf, defpackage.cmvs, defpackage.cmvt
    public void g() {
        super.g();
        this.C = true;
        p();
        this.z.l();
        this.y.e(i.ON_STOP);
    }

    @Override // defpackage.cmvs, defpackage.cmvt
    public void l(Configuration configuration) {
        this.z.d();
        this.z.n(configuration);
    }

    @Override // defpackage.cmvs, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View c = this.z.c(null, str, context, attributeSet);
        if (c == null) {
            return null;
        }
        return c;
    }

    @Override // defpackage.cmwf, defpackage.cmvs, defpackage.cmvt
    public void r() {
        super.r();
        this.B = true;
        this.z.d();
        this.z.q();
    }

    @Override // defpackage.cmwf, defpackage.cmvs, defpackage.cmvt
    public void s() {
        super.s();
        this.B = false;
        this.z.k();
        this.y.e(i.ON_PAUSE);
    }

    @Override // defpackage.cmwf, defpackage.cmvs, defpackage.cmvt
    public void t() {
        super.t();
        this.z.m();
        this.y.e(i.ON_DESTROY);
    }

    @Override // defpackage.cmvs, defpackage.cmvt
    public void v(Intent intent) {
        this.z.d();
    }

    public void z(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("Local CarFragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String concat = str.concat("  ");
        printWriter.print(concat);
        printWriter.print("mCreated=");
        printWriter.print(this.A);
        printWriter.print(" mResumed=");
        printWriter.print(this.B);
        printWriter.print(" mStopped=");
        printWriter.print(this.C);
        if (Ol() != null) {
            apd.a(this).b(concat, fileDescriptor, printWriter, strArr);
        }
        this.z.b().s(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.println("View Hierarchy:");
        n(str.concat("  "), printWriter, Nr().getDecorView());
    }
}
