package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: wiw  reason: default package */
/* loaded from: classes4.dex */
public final class wiw implements DialogInterface.OnShowListener {
    final /* synthetic */ wix a;

    public wiw(wix wixVar) {
        this.a = wixVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        wix wixVar = this.a;
        wixVar.g = wixVar.d.getButton(-1);
        wix wixVar2 = this.a;
        wixVar2.h = wixVar2.d.getButton(-2);
        this.a.g.setOnClickListener(new wiv(this, 1));
        this.a.h.setOnClickListener(new wiv(this));
    }
}
