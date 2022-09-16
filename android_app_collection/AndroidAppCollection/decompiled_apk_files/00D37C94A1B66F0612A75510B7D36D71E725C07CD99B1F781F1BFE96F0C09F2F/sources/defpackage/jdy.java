package defpackage;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.libraries.youtube.offline.ui.OfflineDialogOptionView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
/* compiled from: PG */
/* renamed from: jdy  reason: default package */
/* loaded from: classes3.dex */
public final class jdy implements ahcz, ahcf {
    private AlertDialog A;
    private AlertDialog B;
    private AlertDialog C;
    private AlertDialog D;
    private AlertDialog E;
    private AlertDialog F;
    private AlertDialog G;
    private AlertDialog H;
    public final dt a;
    public final agvq b;
    public final fcu c;
    public final akge d;
    public AlertDialog e;
    AlertDialog f;
    CheckBox g;
    View h;
    ListView i;
    public ahcw j;
    public ahdc k;
    public ahda l;
    public ahda m;
    public ahda n;
    public ahdb o;
    public ahdb p;
    public ahda q;
    public ahaz r;
    public ahay s;
    private final ahcu t;
    private final aafo u;
    private final azqb v;
    private final azqb w;
    private final ahcd x;
    private final fcl y;
    private View.OnClickListener z;

    public jdy(dt dtVar, ahcu ahcuVar, agvq agvqVar, aafo aafoVar, fcu fcuVar, azqb azqbVar, azqb azqbVar2, ahcd ahcdVar, akge akgeVar, fcl fclVar) {
        this.a = dtVar;
        this.t = ahcuVar;
        this.b = agvqVar;
        this.u = aafoVar;
        this.c = fcuVar;
        this.v = azqbVar;
        this.w = azqbVar2;
        this.x = ahcdVar;
        this.d = akgeVar;
        this.y = fclVar;
    }

    public static final void t(attp attpVar, acti actiVar) {
        if (actiVar == null) {
            return;
        }
        actiVar.n(new acte(actj.DOWNLOAD_QUALITY_SELECTION_DIALOG));
        ahdq.g(attpVar, actiVar);
    }

    private final AlertDialog u(int i, int i2, ahda ahdaVar, Integer num, int i3) {
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(this.a).setTitle(i).setMessage(i2).setCancelable(true).setPositiveButton(i3, new jdq(ahdaVar));
        positiveButton.setNegativeButton(num.intValue(), (DialogInterface.OnClickListener) null);
        return positiveButton.create();
    }

    private final AlertDialog v(jdx[] jdxVarArr, DialogInterface.OnClickListener onClickListener) {
        return new AlertDialog.Builder(this.a).setTitle(R.string.offline_fragment_title).setCancelable(true).setAdapter(new jdr(this, this.a, jdxVarArr, jdxVarArr), onClickListener).create();
    }

    private final void w(String str, attp attpVar, acti actiVar, ahdc ahdcVar, int i) {
        ahdcVar.getClass();
        this.k = ahdcVar;
        ahcu ahcuVar = this.t;
        Map d = agqb.d(attpVar);
        amuk s = ahcuVar.a.s();
        ArrayList arrayList = new ArrayList();
        for (attl attlVar : d.keySet()) {
            if (s.contains(attlVar)) {
                arrayList.add((agqb) d.get(attlVar));
            }
        }
        Collections.sort(arrayList, ahcuVar.a.f());
        boolean n = this.b.n();
        if (!arrayList.isEmpty()) {
            if (amps.e(str) || !n) {
                b(i, arrayList);
                e(attpVar);
                t(attpVar, actiVar);
                return;
            }
            agqv e = ((agrf) this.v.get()).a().m().e(str);
            boolean z = e != null && e.s();
            boolean g = this.y.g(emn.v(str));
            if ((!z && !g) || ((yrj) this.w.get()).o()) {
                final ahcu ahcuVar2 = this.t;
                final dt dtVar = this.a;
                final jdu jduVar = new jdu(this, i, attpVar, actiVar, arrayList);
                atqv atqvVar = ahcuVar2.e.a().g;
                if (atqvVar == null) {
                    atqvVar = atqv.a;
                }
                if (atqvVar.H) {
                    ahcuVar2.c(dtVar, attpVar, str, agqb.a(arrayList), new ahco(jduVar));
                    return;
                }
                ylr.c();
                final ProgressDialog progressDialog = new ProgressDialog(dtVar);
                progressDialog.setMessage(dtVar.getString(R.string.offline_stream_selection_waiting));
                progressDialog.setCancelable(false);
                progressDialog.setIndeterminate(true);
                progressDialog.show();
                Collections.sort(arrayList, ahdp.c);
                final ahcq ahcqVar = new ahcq(attpVar.i.I(), str, arrayList);
                ylx.l(ahcuVar2.d.qp(new Callable() { // from class: ahcm
                    /* JADX WARN: Removed duplicated region for block: B:58:0x0104 A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:61:0x0035 A[SYNTHETIC] */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object call() {
                        /*
                            Method dump skipped, instructions count: 353
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahcm.call():java.lang.Object");
                    }
                }), ahcuVar2.c, new ylv() { // from class: ahcg
                    @Override // defpackage.zdt
                    /* renamed from: b */
                    public final void a(Throwable th) {
                        ProgressDialog progressDialog2 = progressDialog;
                        yiw yiwVar = jduVar;
                        ahcq ahcqVar2 = ahcqVar;
                        if (progressDialog2.isShowing()) {
                            progressDialog2.dismiss();
                        }
                        if (th instanceof Exception) {
                            yiwVar.a(ahcqVar2, (Exception) th);
                        } else {
                            yiwVar.a(ahcqVar2, new RuntimeException(th));
                        }
                    }
                }, new ylw() { // from class: ahci
                    @Override // defpackage.ylw, defpackage.zdt
                    public final void a(Object obj) {
                        ProgressDialog progressDialog2 = progressDialog;
                        yiw yiwVar = jduVar;
                        ahcq ahcqVar2 = ahcqVar;
                        ahcr ahcrVar = (ahcr) obj;
                        if (progressDialog2.isShowing()) {
                            progressDialog2.dismiss();
                        }
                        ahcp ahcpVar = ahcrVar.c;
                        if (ahcpVar == null) {
                            if (ahcrVar.a.isEmpty()) {
                                yiwVar.a(ahcqVar2, new ahcp(null, false, null));
                                return;
                            } else {
                                yiwVar.b(ahcqVar2, ahcrVar);
                                return;
                            }
                        }
                        yiwVar.a(ahcqVar2, ahcpVar);
                    }
                }, new Runnable() { // from class: ahck
                    @Override // java.lang.Runnable
                    public final void run() {
                        ProgressDialog progressDialog2 = progressDialog;
                        yiw yiwVar = jduVar;
                        ahcq ahcqVar2 = ahcqVar;
                        if (progressDialog2.isShowing()) {
                            progressDialog2.dismiss();
                        }
                        yiwVar.a(ahcqVar2, new CancellationException());
                    }
                });
                return;
            }
            b(i, arrayList);
            e(attpVar);
            t(attpVar, actiVar);
        }
    }

    public final void b(int i, List list) {
        int i2 = 0;
        if (this.f == null) {
            LayoutInflater from = LayoutInflater.from(this.a);
            View inflate = from.inflate(R.layout.offline_stream_selection_dialog, (ViewGroup) null, false);
            ListView listView = (ListView) inflate.findViewById(R.id.offline_stream_selection_list);
            this.i = listView;
            View inflate2 = from.inflate(R.layout.offline_stream_selection_footer, (ViewGroup) listView, false);
            this.i.addFooterView(inflate2);
            ahcw ahcwVar = new ahcw(this.a, this.i);
            this.j = ahcwVar;
            this.i.setAdapter((ListAdapter) ahcwVar);
            this.h = inflate2.findViewById(R.id.offline_stream_selection_group_bottom_separator);
            this.g = (CheckBox) inflate2.findViewById(R.id.remember_stream_setting);
            this.f = new AlertDialog.Builder(this.a).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setView(inflate).create();
        }
        if (!list.isEmpty()) {
            ahcw ahcwVar2 = this.j;
            ahcwVar2.setNotifyOnChange(false);
            ahcwVar2.clear();
            ahcwVar2.addAll(list);
            ahcwVar2.notifyDataSetChanged();
            ListView listView2 = ahcwVar2.b;
            if (listView2 != null) {
                listView2.clearChoices();
            }
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((agqb) it.next()).a == attl.HD_1080) {
                if (!((fda) this.c.a.c()).e) {
                    this.f.setOnShowListener(new DialogInterface.OnShowListener() { // from class: jdm
                        @Override // android.content.DialogInterface.OnShowListener
                        public final void onShow(DialogInterface dialogInterface) {
                            jdy jdyVar = jdy.this;
                            ylx.m(jdyVar.c.a.b(new egf(20)), gpe.m);
                            if (!jdyVar.c.f()) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= jdyVar.j.getCount()) {
                                        i3 = -1;
                                        break;
                                    }
                                    agqb agqbVar = (agqb) jdyVar.j.getItem(i3);
                                    if (agqbVar != null && agqbVar.a == attl.HD_1080) {
                                        break;
                                    }
                                    i3++;
                                }
                                View view = null;
                                if (i3 >= 0) {
                                    ListView listView3 = jdyVar.i;
                                    View childAt = listView3.getChildAt(i3 - listView3.getFirstVisiblePosition());
                                    if (childAt instanceof OfflineDialogOptionView) {
                                        view = childAt.findViewById(R.id.radio_button);
                                    }
                                }
                                if (view == null) {
                                    return;
                                }
                                jdyVar.d.g(jdyVar.i);
                                akfp a = akfq.a();
                                a.a = view;
                                a.c = jdyVar.a.getString(R.string.offline_new_quality_setting_tooltip_text);
                                a.h(1);
                                a.c(1);
                                a.f = new jds(jdyVar);
                                a.l();
                                a.f(0);
                                jdyVar.d.c(a.a());
                            }
                        }
                    });
                }
            }
        }
        this.f.setOnShowListener(null);
        this.g.setVisibility(0);
        this.h.setVisibility(0);
        this.f.setTitle(i);
        ahcw ahcwVar3 = this.j;
        attl attlVar = ((agqb) list.get(0)).a;
        if (ahcwVar3.b != null) {
            int count = ahcwVar3.getCount();
            while (true) {
                if (i2 < count) {
                    agqb agqbVar = (agqb) ahcwVar3.getItem(i2);
                    if (agqbVar != null && agqbVar.a == attlVar) {
                        ahcwVar3.b.setItemChecked(i2, true);
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
        }
        ylx.n(this.a, this.c.a(), new jdo(this), new jdo(this, 1));
    }

    public final void c(atsd atsdVar, acti actiVar) {
        avvh avvhVar;
        aoob aoobVar;
        int i = atsdVar.b;
        if (i == 88122887) {
            avvh avvhVar2 = (avvh) atsdVar.c;
            aoobVar = avvhVar2.i;
            avvhVar = avvhVar2;
        } else if (i == 53345347) {
            aqmu aqmuVar = (aqmu) atsdVar.c;
            aoobVar = aqmuVar.h;
            avvhVar = aqmuVar;
        } else if (i == 64099105) {
            aqft aqftVar = (aqft) atsdVar.c;
            aoobVar = aqftVar.n;
            avvhVar = aqftVar;
        } else {
            avvhVar = null;
            aoobVar = null;
        }
        aoobVar.getClass();
        actiVar.D(new acte(aoobVar));
        this.x.a(avvhVar, actiVar, null, null);
    }

    @Override // defpackage.ahcf
    public final void d(attp attpVar, acti actiVar, ahdc ahdcVar, String str) {
        w(null, attpVar, actiVar, ahdcVar, R.string.add_playlist_to_offline);
    }

    public final void e(attp attpVar) {
        this.f.show();
        this.z = new jdt(this);
        this.f.getButton(-1).setOnClickListener(this.z);
        aafx.c(this.u, attpVar.h, attpVar);
    }

    @Override // defpackage.ahcz
    public final void f(ahda ahdaVar) {
        this.q = ahdaVar;
        if (this.H == null) {
            this.H = u(R.string.offline_dialog_title_expired, R.string.offline_dialog_message_expired, new jdv(this), Integer.valueOf((int) R.string.cancel), R.string.offline_expiration_dialog_renew_button);
        }
        this.H.show();
    }

    @Override // defpackage.ahcz
    public final void g(String str, attp attpVar, acti actiVar, ahdc ahdcVar) {
        w(str, attpVar, actiVar, ahdcVar, R.string.add_video_to_offline);
    }

    @Override // defpackage.ahcf
    public final void h(final ahda ahdaVar) {
        if (this.b.O()) {
            if (this.e == null) {
                this.e = new AlertDialog.Builder(this.a).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setTitle(R.string.unknown_playlist_size_warning_title).setMessage(R.string.unknown_playlist_size_warning_message).setView(LayoutInflater.from(this.a).inflate(R.layout.offline_playlist_warning_dialog, (ViewGroup) null, false)).create();
            }
            this.e.show();
            final CheckBox checkBox = (CheckBox) this.e.findViewById(R.id.do_not_show_offline_playlist_warning_checkbox);
            checkBox.setChecked(false);
            this.e.getButton(-1).setOnClickListener(new View.OnClickListener() { // from class: jdn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    jdy jdyVar = jdy.this;
                    CheckBox checkBox2 = checkBox;
                    ahda ahdaVar2 = ahdaVar;
                    if (checkBox2.isChecked()) {
                        jdyVar.b.S();
                    }
                    jdyVar.e.dismiss();
                    ahdaVar2.b();
                }
            });
            return;
        }
        ahdaVar.b();
    }

    @Override // defpackage.ahcf
    public final void i(ahda ahdaVar, ahbt ahbtVar) {
        this.n = ahdaVar;
        if (this.B == null) {
            this.B = u(R.string.remove_offline_playlists_title, R.string.remove_offline_playlists_message, new jdv(this, 1), Integer.valueOf((int) R.string.cancel), R.string.remove_offline_confirmed_button);
        }
        this.B.show();
    }

    @Override // defpackage.ahcz
    public final void j(ahda ahdaVar) {
        this.m = ahdaVar;
        if (this.A == null) {
            this.A = u(R.string.remove_offline_video_title, R.string.remove_offline_video_message, new jdv(this, 2), Integer.valueOf((int) R.string.cancel), R.string.remove_offline_confirmed_button);
        }
        this.A.show();
    }

    @Override // defpackage.ahcz
    public final void k(ahda ahdaVar, String str, String str2) {
        new AlertDialog.Builder(this.a).setTitle(str).setMessage(str2).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.remove_offline_confirmed_button, new jdq(ahdaVar, 1)).create().show();
    }

    @Override // defpackage.ahcz
    public final void l(ahdb ahdbVar) {
        new AlertDialog.Builder(this.a).setMessage(R.string.offline_retry_failed_videos_dialog_message).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.ok, new jdw(ahdbVar)).show();
    }

    @Override // defpackage.ahcz
    public final void m(ahdb ahdbVar) {
        if (this.E == null) {
            this.E = new AlertDialog.Builder(this.a).setTitle(R.string.readd_to_offline_video).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.readd_offline, new jdp(this, 3)).create();
        }
        this.o = ahdbVar;
        this.E.show();
    }

    @Override // defpackage.ahcz
    public final void n(ahdb ahdbVar, String str) {
        new AlertDialog.Builder(this.a).setTitle(R.string.readd_to_offline_video).setMessage(str).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.readd_offline, new jdw(ahdbVar, 1)).create().show();
    }

    @Override // defpackage.ahcz
    public final void o(ahdb ahdbVar) {
        if (this.G == null) {
            this.G = new AlertDialog.Builder(this.a).setTitle(R.string.readd_to_offline_video).setMessage(R.string.offline_file_not_found_dialog_message).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.save_offline, new jdp(this, 1)).create();
        }
        this.p = ahdbVar;
        this.G.show();
    }

    @Override // defpackage.ahcf
    public final void p(ahda ahdaVar, ahbt ahbtVar) {
        i(ahdaVar, ahbtVar);
    }

    @Override // defpackage.ahcz
    public final void q(ahda ahdaVar) {
        this.l = ahdaVar;
        if (this.C == null) {
            this.C = u(R.string.stop_offline_video_title, R.string.stop_offline_video_message, new jdv(this, 3), Integer.valueOf((int) R.string.stop_offline_dismiss_button), R.string.stop_offline_confirmed_button);
        }
        this.C.show();
    }

    @Override // defpackage.ahcf
    public final void r(ahaz ahazVar) {
        if (this.D == null) {
            this.D = v(new jdx[]{new jdx(R.string.approve_playlist_sync, 2131231719)}, new jdp(this, 2));
        }
        this.r = ahazVar;
        this.D.show();
    }

    @Override // defpackage.ahcf
    public final void s(ahay ahayVar) {
        if (this.F == null) {
            this.F = v(new jdx[]{new jdx(R.string.sync_offline_playlist_action, 2131231719), new jdx(R.string.remove_offline_playlist_action, 2131231718)}, new jdp(this));
        }
        this.s = ahayVar;
        this.F.show();
    }
}
