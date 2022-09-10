package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ajgi  reason: default package */
/* loaded from: classes2.dex */
public final class ajgi extends fd implements ajif {
    private static final dcqe e = dcqe.c("ajgi");
    public boolean a;
    public ajzq b;
    public ajzv c;
    public Executor d;
    @dzsi
    private ajie f;

    @Override // defpackage.fd
    public final void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    @Override // defpackage.ajif
    public final synchronized void d(ajie ajieVar) {
        if (this.f != null) {
            bvoo.h("attempted to add permissions listener when already set", new Object[0]);
        } else {
            this.f = ajieVar;
        }
    }

    @Override // defpackage.ajif
    public final synchronized void e() {
        this.f = null;
    }

    @Override // defpackage.ajif
    public final void f(boolean z) {
        this.a = z;
        final ajzp a = this.b.a();
        ajze ajzeVar = (ajze) a;
        if (ajzeVar.a == ajzo.PERMISSIONS_RESULT_SUCCESS) {
            this.d.execute(new Runnable(this, a) { // from class: ajgd
                private final ajgi a;
                private final ajzp b;

                {
                    this.a = this;
                    this.b = a;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.g(this.b);
                }
            });
            return;
        }
        ArrayList arrayList = new ArrayList();
        dcpd<Map.Entry<String, Boolean>> it = ajzeVar.b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Boolean> next = it.next();
            if (!next.getValue().booleanValue()) {
                arrayList.add(next.getKey());
            }
        }
        final ajzv ajzvVar = this.c;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        final axrv axrvVar = new axrv(this) { // from class: ajge
            private final ajgi a;

            {
                this.a = this;
            }

            @Override // defpackage.axrv
            public final void a(int[] iArr) {
                final ff J;
                ajgi ajgiVar = this.a;
                ajzp a2 = ajgiVar.b.a();
                ajgiVar.g(a2);
                if (!ajgiVar.a || (J = ajgiVar.J()) == null || ((ajze) a2).a == ajzo.PERMISSIONS_RESULT_SUCCESS) {
                    return;
                }
                dafk b = ckos.b(J.findViewById(16908290), R.string.APP_PERMISSION_DENIED_LABEL, 0);
                b.t(R.string.APP_PERMISSION_DENIED_ACTION, new View.OnClickListener(J) { // from class: ajgf
                    private final Activity a;

                    {
                        this.a = J;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Activity activity = this.a;
                        activity.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", activity.getPackageName(), null)).setFlags(268468224));
                    }
                });
                b.c();
            }
        };
        if (!ako.d()) {
            ajzvVar.a.c(strArr, axrvVar);
            return;
        }
        ArrayList arrayList2 = new ArrayList(Arrays.asList(strArr));
        final boolean contains = arrayList2.contains("android.permission.ACCESS_BACKGROUND_LOCATION");
        final int indexOf = arrayList2.indexOf("android.permission.ACCESS_BACKGROUND_LOCATION");
        arrayList2.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
        if (!contains || !arrayList2.isEmpty()) {
            ajzvVar.a.c((String[]) arrayList2.toArray(new String[0]), new axrv(ajzvVar, contains, axrvVar, indexOf) { // from class: ajzs
                private final ajzv a;
                private final boolean b;
                private final axrv c;
                private final int d;

                {
                    this.a = ajzvVar;
                    this.b = contains;
                    this.c = axrvVar;
                    this.d = indexOf;
                }

                @Override // defpackage.axrv
                public final void a(final int[] iArr) {
                    final ajzv ajzvVar2 = this.a;
                    boolean z2 = this.b;
                    final axrv axrvVar2 = this.c;
                    final int i = this.d;
                    if (!z2) {
                        axrvVar2.a(iArr);
                        return;
                    }
                    for (int i2 : iArr) {
                        if (i2 != 0) {
                            axrvVar2.a(ajzv.a(iArr, -1, i));
                            return;
                        }
                    }
                    new Handler(Looper.getMainLooper()).post(new Runnable(ajzvVar2, axrvVar2, iArr, i) { // from class: ajzt
                        private final ajzv a;
                        private final axrv b;
                        private final int[] c;
                        private final int d;

                        {
                            this.a = ajzvVar2;
                            this.b = axrvVar2;
                            this.c = iArr;
                            this.d = i;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ajzv ajzvVar3 = this.a;
                            final axrv axrvVar3 = this.b;
                            final int[] iArr2 = this.c;
                            final int i3 = this.d;
                            ajzvVar3.a.g(new axrw(axrvVar3, iArr2, i3) { // from class: ajzu
                                private final axrv a;
                                private final int[] b;
                                private final int c;

                                {
                                    this.a = axrvVar3;
                                    this.b = iArr2;
                                    this.c = i3;
                                }

                                @Override // defpackage.axrw
                                public final void a(int i4) {
                                    this.a.a(ajzv.a(this.b, i4, this.c));
                                }
                            });
                        }
                    });
                }
            });
        } else {
            ajzvVar.a.g(new axrw(axrvVar) { // from class: ajzr
                private final axrv a;

                {
                    this.a = axrvVar;
                }

                @Override // defpackage.axrw
                public final void a(int i) {
                    this.a.a(new int[]{i});
                }
            });
        }
    }

    public final synchronized void g(final ajzp ajzpVar) {
        final ajie ajieVar = this.f;
        if (ajieVar != null) {
            this.d.execute(new Runnable(ajieVar, ajzpVar) { // from class: ajgg
                private final ajie a;
                private final ajzp b;

                {
                    this.a = ajieVar;
                    this.b = ajzpVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.g(this.b);
                }
            });
        }
    }
}
