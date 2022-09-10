package com.google.android.apps.gmm.locationsharing.widget;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.gmm.locationsharing.widget.SelectedPersonCreateShortcutActivity;
import com.google.android.apps.maps.R;
import java.util.UUID;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class SelectedPersonCreateShortcutActivity extends akbp {
    public static final Paint u = new Paint(3);
    public amfi v;
    private akbw w;

    private static void M(Context context, String str, amfi amfiVar, akbu akbuVar) {
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), 2131231857);
        Bitmap createBitmap = Bitmap.createBitmap(decodeResource.getWidth(), decodeResource.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(decodeResource, new Matrix(), null);
        float f = context.getResources().getDisplayMetrics().density;
        float f2 = f * 9.0f;
        int width = (int) (createBitmap.getWidth() - f2);
        amfiVar.d(ckqc.FIFE_MONOGRAM_CIRCLE_CROP.a(str, width, width, null), new akbt(canvas, f2, f * 3.0f, createBitmap, context, f, akbuVar), null);
    }

    public static void p(final Context context, @dzsi final btlu btluVar, final PersonId personId, final String str, String str2, amfi amfiVar, final akbv akbvVar) {
        M(context, str2, amfiVar, new akbu(context, btluVar, personId, akbvVar, str) { // from class: akbr
            private final Context a;
            private final btlu b;
            private final PersonId c;
            private final akbv d;
            private final String e;

            {
                this.a = context;
                this.b = btluVar;
                this.c = personId;
                this.d = akbvVar;
                this.e = str;
            }

            @Override // defpackage.akbu
            public final void a(Bitmap bitmap) {
                Context context2 = this.a;
                btlu btluVar2 = this.b;
                PersonId personId2 = this.c;
                akbv akbvVar2 = this.d;
                String str3 = this.e;
                Intent n = ahyr.n(context2, dbsg.j(btluVar2), personId2, ahwe.SHORTCUT);
                n.setAction("android.intent.action.VIEW");
                String format = String.format("selectedPersonShortcut_%s", UUID.randomUUID().toString());
                if (bitmap == null) {
                    akbvVar2.a(yzi.g(context2, format, str3, R.drawable.friend_default_icon, n));
                } else {
                    akbvVar2.a(yzi.f(context2, format, str3, bitmap, n));
                }
            }
        });
    }

    public static void v(final Context context, @dzsi final btlu btluVar, final PersonId personId, final String str, String str2, amfi amfiVar, final airg airgVar) {
        M(context, str2, amfiVar, new akbu(context, btluVar, personId, airgVar, str) { // from class: akbq
            private final Context a;
            private final btlu b;
            private final PersonId c;
            private final String d;
            private final airg e;

            {
                this.a = context;
                this.b = btluVar;
                this.c = personId;
                this.e = airgVar;
                this.d = str;
            }

            @Override // defpackage.akbu
            public final void a(Bitmap bitmap) {
                Context context2 = this.a;
                btlu btluVar2 = this.b;
                PersonId personId2 = this.c;
                airg airgVar2 = this.e;
                String str3 = this.d;
                Intent n = ahyr.n(context2, dbsg.j(btluVar2), personId2, ahwe.SHORTCUT);
                n.setAction("android.intent.action.VIEW");
                String format = String.format("selectedPersonShortcut_%s", UUID.randomUUID().toString());
                if (bitmap == null) {
                    airgVar2.a(yzi.i(context2, format, str3, R.drawable.friend_default_icon, n));
                } else {
                    airgVar2.a(yzi.h(context2, format, str3, bitmap, n));
                }
            }
        });
    }

    @Override // defpackage.akbh
    public final void Pm(@dzsi btlu btluVar, ahwl ahwlVar) {
        p(this, btluVar, ahwlVar.q(), ahwlVar.t(), ahwlVar.u(), this.v, new akbv(this) { // from class: akbs
            private final SelectedPersonCreateShortcutActivity a;

            {
                this.a = this;
            }

            @Override // defpackage.akbv
            public final void a(Intent intent) {
                SelectedPersonCreateShortcutActivity selectedPersonCreateShortcutActivity = this.a;
                intent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
                selectedPersonCreateShortcutActivity.setResult(-1, intent);
                selectedPersonCreateShortcutActivity.finish();
            }
        });
    }

    @Override // defpackage.akbp
    protected final btsy o() {
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.akbp, defpackage.gga, defpackage.ff, defpackage.agi, defpackage.iw, android.app.Activity
    public final void onCreate(@dzsi Bundle bundle) {
        akbw akbwVar = (akbw) btsq.a(akbw.class, this);
        this.w = akbwVar;
        akbwVar.wM(this);
        super.onCreate(bundle);
        ((akbp) this).l = this.o.a();
        this.k = this.n.e(new akba());
        this.p.b(new Runnable(this) { // from class: akbl
            private final akbp a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final akbp akbpVar = this.a;
                final btlu k = akbpVar.m.b() ? akbpVar.r.k() : null;
                akbpVar.p.b(new Runnable(akbpVar, k) { // from class: akbo
                    private final akbp a;
                    private final btlu b;

                    {
                        this.a = akbpVar;
                        this.b = k;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        akbp akbpVar2 = this.a;
                        btlu btluVar = this.b;
                        if (btlu.q(btluVar).m()) {
                            Toast.makeText(akbpVar2, akbpVar2.getString(R.string.CREATE_FRIEND_LOCATION_WIDGET_NOT_AVAILABLE_IN_INCOGNITO), 1).show();
                            akbpVar2.finish();
                        }
                        akbpVar2.l.Pk(new Runnable(akbpVar2, btluVar) { // from class: akbm
                            private final akbp a;
                            private final btlu b;

                            {
                                this.a = akbpVar2;
                                this.b = btluVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                final akbp akbpVar3 = this.a;
                                btlu btluVar2 = this.b;
                                cqkf<akbb> cqkfVar = akbpVar3.k;
                                dccx F = dcdc.F();
                                dcdc<ahwl> d = akbpVar3.o.d(btluVar2);
                                int size = d.size();
                                for (int i = 0; i < size; i++) {
                                    ahwl ahwlVar = d.get(i);
                                    if (ahwlVar.q().c == ahwj.GAIA) {
                                        F.g(new akbj(ahwlVar, btluVar2, akbpVar3));
                                    }
                                }
                                cqkfVar.e(new akbc(F.f(), akbpVar3, akbpVar3.t, new View.OnClickListener(akbpVar3) { // from class: akbn
                                    private final akbp a;

                                    {
                                        this.a = akbpVar3;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        this.a.finish();
                                    }
                                }));
                                akbpVar3.setContentView(akbpVar3.k.c());
                            }
                        }, akbpVar2.p.h());
                        String f = dbsj.f(btlu.q(btluVar).t());
                        if (f != null) {
                            cztq a = cztt.a(akbpVar2.q);
                            a.c = akbpVar2.getString(R.string.SIGNED_IN_AS, new Object[]{f});
                            a.d(cztr.LONG);
                            a.c();
                        }
                    }
                }, bvrj.UI_THREAD);
            }
        }, bvrj.BACKGROUND_THREADPOOL);
    }

    @Override // defpackage.akbp, defpackage.gga
    public final /* bridge */ /* synthetic */ void s() {
    }
}
