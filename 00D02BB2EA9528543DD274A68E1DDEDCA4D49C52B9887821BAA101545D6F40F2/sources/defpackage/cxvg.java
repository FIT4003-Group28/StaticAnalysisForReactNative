package defpackage;

import android.view.View;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
/* compiled from: PG */
/* renamed from: cxvg  reason: default package */
/* loaded from: classes5.dex */
final class cxvg implements cxrh {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ Channel c;
    final /* synthetic */ cxvi d;

    public cxvg(cxvi cxviVar, View view, View view2, Channel channel) {
        this.d = cxviVar;
        this.a = view;
        this.b = view2;
        this.c = channel;
    }

    @Override // defpackage.cxrh
    public final void a() {
        this.d.m = false;
        this.a.post(new cxvf(this));
    }
}
