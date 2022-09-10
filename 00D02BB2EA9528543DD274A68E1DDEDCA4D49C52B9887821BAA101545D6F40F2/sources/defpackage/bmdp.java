package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.net.Uri;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bmdp  reason: default package */
/* loaded from: classes3.dex */
public final class bmdp implements DialogInterface.OnClickListener {
    final /* synthetic */ Uri a;
    final /* synthetic */ Activity b;
    final /* synthetic */ cjtx c;
    final /* synthetic */ bmdq d;

    public bmdp(bmdq bmdqVar, Uri uri, Activity activity, cjtx cjtxVar) {
        this.d = bmdqVar;
        this.a = uri;
        this.b = activity;
        this.c = cjtxVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.d.e(this.a, this.b, this.c);
    }
}
