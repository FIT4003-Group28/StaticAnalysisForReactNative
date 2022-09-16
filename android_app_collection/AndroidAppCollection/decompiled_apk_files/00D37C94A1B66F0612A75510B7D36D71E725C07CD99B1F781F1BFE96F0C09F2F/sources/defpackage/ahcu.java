package defpackage;

import android.app.ProgressDialog;
import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ahcu  reason: default package */
/* loaded from: classes.dex */
public final class ahcu {
    public final agvq a;
    public final ahdl b;
    public final Executor c;
    public final ankw d;
    public final aadd e;

    public ahcu(agvq agvqVar, ahdl ahdlVar, Executor executor, ankw ankwVar, aadd aaddVar) {
        this.a = agvqVar;
        this.b = ahdlVar;
        this.c = executor;
        this.d = ankwVar;
        aaddVar.getClass();
        this.e = aaddVar;
    }

    public static ahcq a(ahcs ahcsVar) {
        return new ahcq(ahcsVar.a, ahcsVar.b, agqb.b(ahcsVar.c));
    }

    public static atsd b(PlayerResponseModel playerResponseModel) {
        atse u = playerResponseModel.u();
        if (u == null || u.c != 7) {
            return null;
        }
        return (atsd) u.d;
    }

    public final void c(final Context context, attp attpVar, String str, List list, final yiw yiwVar) {
        ylr.c();
        final ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setMessage(context.getString(R.string.offline_stream_selection_waiting));
        progressDialog.setCancelable(false);
        progressDialog.setIndeterminate(true);
        progressDialog.show();
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, ahdp.e);
        final ahcs ahcsVar = new ahcs(attpVar.i.I(), str, arrayList);
        ylx.l(this.d.qp(new Callable() { // from class: ahcn
            /* JADX WARN: Removed duplicated region for block: B:46:0x0128  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x012b A[SYNTHETIC] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 391
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ahcn.call():java.lang.Object");
            }
        }), this.c, new ylv() { // from class: ahch
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                ProgressDialog progressDialog2 = progressDialog;
                yiw yiwVar2 = yiwVar;
                ahcs ahcsVar2 = ahcsVar;
                if (progressDialog2.isShowing()) {
                    progressDialog2.dismiss();
                }
                if (th instanceof Exception) {
                    yiwVar2.a(ahcsVar2, (Exception) th);
                } else {
                    yiwVar2.a(ahcsVar2, new RuntimeException(th));
                }
            }
        }, new ylw() { // from class: ahcj
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                ProgressDialog progressDialog2 = progressDialog;
                yiw yiwVar2 = yiwVar;
                ahcs ahcsVar2 = ahcsVar;
                ahct ahctVar = (ahct) obj;
                if (progressDialog2.isShowing()) {
                    progressDialog2.dismiss();
                }
                ahcp ahcpVar = ahctVar.c;
                if (ahcpVar == null) {
                    if (ahctVar.a.isEmpty()) {
                        yiwVar2.a(ahcsVar2, new ahcp(null, false, null));
                        return;
                    } else {
                        yiwVar2.b(ahcsVar2, ahctVar);
                        return;
                    }
                }
                yiwVar2.a(ahcsVar2, ahcpVar);
            }
        }, new Runnable() { // from class: ahcl
            @Override // java.lang.Runnable
            public final void run() {
                ProgressDialog progressDialog2 = progressDialog;
                yiw yiwVar2 = yiwVar;
                ahcs ahcsVar2 = ahcsVar;
                if (progressDialog2.isShowing()) {
                    progressDialog2.dismiss();
                }
                yiwVar2.a(ahcsVar2, new CancellationException());
            }
        });
    }
}
