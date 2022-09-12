package defpackage;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: cmvx  reason: default package */
/* loaded from: classes.dex */
public abstract class cmvx extends Service implements cmvy {
    private cmvz a;

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // defpackage.cmvy
    public int b() {
        return 0;
    }

    public final cmvs d() {
        return (cmvs) ((cnht) this.a).i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        cnht cnhtVar = (cnht) this.a;
        if (cnhtVar.i != null) {
            String valueOf = String.valueOf(cnht.q(cnhtVar.H));
            printWriter.println(valueOf.length() != 0 ? "activity state:".concat(valueOf) : new String("activity state:"));
        }
        cnaa cnaaVar = cnhtVar.k;
        if (cnaaVar != null) {
            String valueOf2 = String.valueOf(cnaaVar.c());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 8);
            sb.append("surface:");
            sb.append(valueOf2);
            printWriter.println(sb.toString());
            String valueOf3 = String.valueOf(cnaaVar.a());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 8);
            sb2.append("display:");
            sb2.append(valueOf3);
            printWriter.println(sb2.toString());
        }
        cmyy cmyyVar = cnhtVar.l;
        if (cmyyVar != null) {
            printWriter.println("ProjectedPresentation:");
            boolean z = cmyyVar.l;
            StringBuilder sb3 = new StringBuilder(24);
            sb3.append("  ");
            sb3.append("configurationSet:");
            sb3.append(z);
            printWriter.println(sb3.toString());
            Resources resources = cmyyVar.getContext().getResources();
            if (resources != null) {
                String valueOf4 = String.valueOf(resources.getConfiguration());
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 16);
                sb4.append("  ");
                sb4.append("configuration:");
                sb4.append(valueOf4);
                printWriter.println(sb4.toString());
            }
            boolean isShowing = cmyyVar.isShowing();
            StringBuilder sb5 = new StringBuilder(17);
            sb5.append("  ");
            sb5.append("isShowing:");
            sb5.append(isShowing);
            printWriter.println(sb5.toString());
            boolean z2 = cmyyVar.i;
            StringBuilder sb6 = new StringBuilder(24);
            sb6.append("  ");
            sb6.append("attachedToWindow:");
            sb6.append(z2);
            printWriter.println(sb6.toString());
            boolean z3 = cmyyVar.k;
            StringBuilder sb7 = new StringBuilder(19);
            sb7.append("  ");
            sb7.append("inTouchMode:");
            sb7.append(z3);
            printWriter.println(sb7.toString());
            Window window = cmyyVar.getWindow();
            String valueOf5 = String.valueOf(window);
            StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf5).length() + 9);
            sb8.append("  ");
            sb8.append("window:");
            sb8.append(valueOf5);
            printWriter.println(sb8.toString());
            boolean z4 = cmyyVar.j;
            StringBuilder sb9 = new StringBuilder("    ".length() + 19);
            sb9.append("    ");
            sb9.append("hasInputFocus:");
            sb9.append(z4);
            printWriter.println(sb9.toString());
            boolean z5 = cmyyVar.m;
            StringBuilder sb10 = new StringBuilder("    ".length() + 20);
            sb10.append("    ");
            sb10.append("windowHasFocus:");
            sb10.append(z5);
            printWriter.println(sb10.toString());
            if (window == null) {
                return;
            }
            String valueOf6 = String.valueOf(window.getAttributes());
            StringBuilder sb11 = new StringBuilder("    ".length() + 13 + String.valueOf(valueOf6).length());
            sb11.append("    ");
            sb11.append("layout param:");
            sb11.append(valueOf6);
            printWriter.println(sb11.toString());
            printWriter.println("    ".concat("view hierarchy:"));
            View decorView = window.getDecorView();
            cmzz cmzzVar = cmzz.a;
            StringBuilder sb12 = new StringBuilder();
            cnji.a(decorView, "", sb12, cmzzVar);
            printWriter.println(sb12.toString());
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        cmvz cmvzVar = this.a;
        if (cmwk.a("CAR.PROJECTION.CAHI", 3)) {
            int i = cnjc.a;
        }
        cnht cnhtVar = (cnht) cmvzVar;
        cnhtVar.b = new cnhq(cnhtVar);
        return cnhtVar.b;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        cnht cnhtVar = (cnht) this.a;
        if (cnhtVar.y.s()) {
            cnhtVar.t();
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (this.a == null) {
            try {
                new cmvm();
                this.a = new cnht();
            } catch (cmvn e) {
                throw new RuntimeException(e);
            }
        }
        cnht cnhtVar = (cnht) this.a;
        cnhtVar.f = this;
        cnhtVar.h = a();
        cnhtVar.r = b();
        cnhtVar.g = new cnhr(cnhtVar.f.getApplicationContext());
        cnhtVar.u = cnhtVar.h.getSimpleName();
        if (cmwk.a("CAR.PROJECTION.CAHI", 3)) {
            int i = cnjc.a;
        }
        cnhtVar.y.j(cnhtVar.A);
        cnhtVar.m = new cngt(cnhtVar.y);
        cnhtVar.I = new cnhu(cnhtVar.m);
        cnhtVar.w = cmvw.a.get(cnhtVar.f.getClass());
    }

    @Override // android.app.Service
    public final void onDestroy() {
        cmvz cmvzVar = this.a;
        if (cmwk.a("CAR.PROJECTION.CAHI", 3)) {
            int i = cnjc.a;
        }
        cnht cnhtVar = (cnht) cmvzVar;
        cnin cninVar = cnhtVar.v;
        if (cninVar != null) {
            if (cmwk.a("CAR.INPUT", 3)) {
                int i2 = cnjc.a;
            }
            cninVar.a = true;
        }
        if (cnhtVar.i != null) {
            cnhtVar.o(0);
        }
        cnhtVar.m();
        cnhtVar.y.t(null);
        cnhtVar.i = null;
        synchronized (cnhtVar.e) {
            cmxz cmxzVar = ((cnht) cmvzVar).J;
            if (cmxzVar != null) {
                cmxzVar.asBinder().unlinkToDeath(((cnht) cmvzVar).e, 0);
                ((cnht) cmvzVar).J = null;
            }
        }
        cnhtVar.k = null;
        cnhtVar.l = null;
        cnhtVar.I = null;
        cnhtVar.n = null;
        cnhtVar.o = null;
        cnhtVar.t = null;
        cnhtVar.u = null;
        cnhtVar.v = null;
        cnhtVar.s = false;
        super.onDestroy();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onLowMemory() {
        cmvt cmvtVar = ((cnht) this.a).i;
        if (cmvtVar != null) {
            cmvtVar.E();
        }
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        cmvz cmvzVar = this.a;
        if (cmwk.a("CAR.PROJECTION.CAHI", 3)) {
            int i = cnjc.a;
        }
        cnht cnhtVar = (cnht) cmvzVar;
        cnhtVar.o(0);
        cnhtVar.m();
        cnhtVar.b = null;
        return false;
    }
}
