package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;
import com.google.android.youtube.R;
import j$.util.Map;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: hni  reason: default package */
/* loaded from: classes3.dex */
public final class hni implements View.OnClickListener, hpy {
    public float A;
    public boolean B;
    public boolean C;
    public Dialog D;
    public Context E;
    public int F;
    public ContextThemeWrapper G;
    public boolean H;
    public boolean I;

    /* renamed from: J  reason: collision with root package name */
    public final vne f209J;
    private final wal K;
    public apzg a;
    public final afvn b;
    public final aafo c;
    public final Handler d;
    public final akzg e;
    public final zsz f;
    public final akys g;
    public final htq h;
    public final hwq i;
    public final ajmy j;
    public final gfu k;
    public final List l = new ArrayList();
    public final List m = new ArrayList();
    public dt n;
    public RecordingInfo o;
    public hnf p;
    public Bitmap q;
    public acti r;
    public hop s;
    public zqw t;
    public apzg u;
    public View v;
    public Button w;
    public Button x;
    public View y;
    public boolean z;

    public hni(afvn afvnVar, aafo aafoVar, Handler handler, akzg akzgVar, zsz zszVar, akys akysVar, htq htqVar, hwq hwqVar, wal walVar, ajmy ajmyVar, gfu gfuVar, vne vneVar) {
        this.b = afvnVar;
        this.c = aafoVar;
        this.d = handler;
        this.e = akzgVar;
        this.f = zszVar;
        this.g = akysVar;
        this.h = htqVar;
        this.i = hwqVar;
        this.K = walVar;
        this.j = ajmyVar;
        this.k = gfuVar;
        this.f209J = vneVar;
    }

    public static void d(FileInputStream fileInputStream, FileOutputStream fileOutputStream) {
        FileChannel fileChannel;
        FileChannel channel;
        FileChannel fileChannel2 = null;
        try {
            channel = fileInputStream.getChannel();
        } catch (Throwable th) {
            th = th;
            fileChannel = null;
        }
        try {
            fileChannel2 = fileOutputStream.getChannel();
            fileChannel2.transferFrom(channel, 0L, channel.size());
            if (channel != null) {
                channel.close();
            }
            if (fileChannel2 == null) {
                return;
            }
            fileChannel2.close();
        } catch (Throwable th2) {
            th = th2;
            FileChannel fileChannel3 = fileChannel2;
            fileChannel2 = channel;
            fileChannel = fileChannel3;
            if (fileChannel2 != null) {
                fileChannel2.close();
            }
            if (fileChannel != null) {
                fileChannel.close();
            }
            throw th;
        }
    }

    @Override // defpackage.hpy
    public final float a() {
        if (this.z) {
            return this.A;
        }
        return 0.0f;
    }

    @Override // defpackage.hpy
    public final float b() {
        if (this.z) {
            return 0.0f;
        }
        return this.A;
    }

    @Override // defpackage.hpy
    public final View c() {
        return this.v;
    }

    @Override // defpackage.hpy
    public final void e() {
    }

    @Override // defpackage.hpy
    public final void f() {
    }

    public final void g() {
        h(true);
    }

    public final void h(boolean z) {
        if (this.z) {
            if (z) {
                hqb.d(this);
            } else {
                this.v.setTranslationY(this.A);
            }
            this.z = false;
        }
    }

    public final void i() {
        ylx.n(this.n, this.f209J.b(new hmx(this, 1), anjk.a), etg.t, hmv.a);
    }

    public final void j() {
        View inflate = LayoutInflater.from(this.G).inflate(R.layout.reel_post_confirmation_dialog, (ViewGroup) null);
        inflate.findViewById(R.id.reel_post_confirmation_dialog_learn_more).setOnClickListener(new hmz(this, 2));
        ((CheckBox) inflate.findViewById(R.id.reel_post_dont_show_checkbox)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: hnb
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                hni hniVar = hni.this;
                hniVar.C = z;
                compoundButton.setButtonTintList(zhn.f(hniVar.E, true != z ? R.attr.ytIconInactive : R.attr.ytCallToAction));
            }
        });
        inflate.findViewById(R.id.reel_post_button).setOnClickListener(new hmz(this, 3));
        inflate.findViewById(R.id.close_button).setOnClickListener(new hmz(this, 4));
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.reel_post_confirmation_avatar_frame);
        if (this.K.a() == null) {
            frameLayout.setVisibility(8);
        } else {
            aalc aalcVar = this.K.a().e;
            if (aalcVar == null || aalcVar.a() == null) {
                frameLayout.setVisibility(8);
            } else {
                this.j.l(aalcVar.a().a(), new hne(this, frameLayout));
            }
        }
        this.D.setContentView(inflate);
    }

    public final void k() {
        if (!this.z) {
            hqb.d(this);
            this.z = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
        if (r2.f != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(final android.content.Context r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.y
            r1 = 0
            r0.setEnabled(r1)
            zqw r0 = r5.t
            hnf r2 = r5.p
            r3 = r2
            hnu r3 = (defpackage.hnu) r3
            boolean r3 = r3.a
            r4 = 1
            if (r3 == 0) goto L2b
            zwx r2 = (defpackage.zwx) r2
            aadd r2 = r2.aC
            arhd r2 = r2.a()
            int r3 = r2.b
            r3 = r3 & 4096(0x1000, float:5.74E-42)
            if (r3 == 0) goto L2a
            avvf r2 = r2.h
            if (r2 != 0) goto L26
            avvf r2 = defpackage.avvf.a
        L26:
            boolean r2 = r2.f
            if (r2 == 0) goto L2b
        L2a:
            r1 = 1
        L2b:
            hmw r2 = new hmw
            r2.<init>()
            amon r3 = defpackage.amon.a
            zqv r0 = r0.q()
            if (r1 == 0) goto L43
            if (r0 == 0) goto L43
            hpj r1 = new hpj
            r1.<init>()
            r0.f(r4, r3, r1)
            return
        L43:
            r6 = 0
            r2.a(r6, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hni.l(android.content.Context):void");
    }

    public final void m(int i) {
        kz.u(this.x, null, po.b(this.n, i), null);
    }

    public final boolean n(hwp hwpVar) {
        if (!this.H) {
            return false;
        }
        if (this.b.c() == null) {
            return true;
        }
        this.b.c().b();
        return !((Boolean) Map.EL.getOrDefault(Collections.unmodifiableMap(hwpVar.r), this.b.c().b(), false)).booleanValue();
    }

    public final boolean o(hwp hwpVar) {
        return this.B && !hwpVar.d;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(final View view) {
        if (view == this.w) {
            this.r.H(3, new acte(actj.UPLOAD_VIDEO_EDITING_SAVE_LOCALLY_BUTTON), null);
            new hnh(this).execute(new Void[0]);
        } else if (view == this.x) {
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.s);
            this.c.c(this.a, hashMap);
            ((hnu) this.p).aY();
        } else if (view != this.y) {
        } else {
            if (this.B || this.H) {
                ylx.n(this.n, this.f209J.a(), etg.s, new zdt() { // from class: hmu
                    @Override // defpackage.zdt
                    public final void a(Object obj) {
                        final boolean z;
                        boolean z2;
                        final hni hniVar = hni.this;
                        View view2 = view;
                        hwp hwpVar = (hwp) obj;
                        if (hwpVar != null) {
                            z2 = hniVar.n(hwpVar);
                            z = hniVar.o(hwpVar);
                        } else {
                            z = true;
                            z2 = true;
                        }
                        if (z2 || z) {
                            hniVar.E = hniVar.v.getContext();
                            int i = hniVar.k.a() == gfs.LIGHT ? R.style.ReelPostCaptureDialogTheme : R.style.ReelPostCaptureDialogThemeDark;
                            hniVar.F = i;
                            hniVar.G = new ContextThemeWrapper(hniVar.E, i);
                            hniVar.D = new aljo(hniVar.G, hniVar.F);
                            hniVar.D.setCanceledOnTouchOutside(true);
                            hniVar.D.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: hmt
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    hni hniVar2 = hni.this;
                                    hniVar2.r.H(3, new acte(actj.EDIT_CREATOR_COMPLIANCE_DISMISS_BUTTON), null);
                                    hniVar2.r.t();
                                }
                            });
                            hniVar.D.setOnShowListener(new DialogInterface.OnShowListener() { // from class: hmy
                                @Override // android.content.DialogInterface.OnShowListener
                                public final void onShow(DialogInterface dialogInterface) {
                                    hni hniVar2 = hni.this;
                                    hniVar2.r.n(new acte(actj.EDIT_CREATOR_COMPLIANCE_DISMISS_BUTTON));
                                    hniVar2.r.n(new acte(actj.EDIT_CREATOR_COMPLIANCE_LEARN_MORE_BUTTON));
                                    hniVar2.r.n(new acte(actj.UPLOAD_VIDEO_EDITING_DONE_BUTTON));
                                }
                            });
                            if (z2) {
                                View inflate = LayoutInflater.from(hniVar.G).inflate(R.layout.stories_aadc_notice, (ViewGroup) null);
                                inflate.findViewById(R.id.stories_aadc_notice_next_button).setOnClickListener(new View.OnClickListener() { // from class: hna
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view3) {
                                        hni hniVar2 = hni.this;
                                        if (z) {
                                            hniVar2.I = true;
                                            hniVar2.i();
                                            hniVar2.j();
                                        }
                                    }
                                });
                                inflate.findViewById(R.id.reel_post_button).setOnClickListener(new hmz(hniVar));
                                inflate.findViewById(R.id.close_button).setOnClickListener(new hmz(hniVar, 1));
                                int i2 = 8;
                                inflate.findViewById(R.id.stories_aadc_notice_next_button).setVisibility(true != z ? 8 : 0);
                                View findViewById = inflate.findViewById(R.id.reel_post_button);
                                if (true != z) {
                                    i2 = 0;
                                }
                                findViewById.setVisibility(i2);
                                aopc aopcVar = (aopc) avhn.a.createBuilder();
                                aopa createBuilder = avhm.a.createBuilder();
                                createBuilder.copyOnWrite();
                                avhm avhmVar = (avhm) createBuilder.instance;
                                avhmVar.b = 1 | avhmVar.b;
                                avhmVar.c = "https://www.gstatic.com/youtube/img/aadc/teen_uploads_mobile_1x.png";
                                createBuilder.copyOnWrite();
                                avhm avhmVar2 = (avhm) createBuilder.instance;
                                avhmVar2.b |= 2;
                                avhmVar2.d = 95;
                                createBuilder.copyOnWrite();
                                avhm avhmVar3 = (avhm) createBuilder.instance;
                                avhmVar3.b |= 4;
                                avhmVar3.e = 95;
                                aopcVar.cw(createBuilder);
                                hniVar.j.h((ImageView) inflate.findViewById(R.id.stories_aadc_notice_icon), (avhn) aopcVar.mo39build());
                                hniVar.D.setContentView(inflate);
                            } else {
                                hniVar.j();
                            }
                            hniVar.D.show();
                            hniVar.r.H(3, new acte(actj.EDIT_NEXT_STEP_BUTTON), null);
                            return;
                        }
                        hniVar.l(view2.getContext().getApplicationContext());
                    }
                });
            } else {
                l(view.getContext().getApplicationContext());
            }
        }
    }
}
