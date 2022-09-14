package defpackage;

import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxut  reason: default package */
/* loaded from: classes5.dex */
public final class cxut implements cxrh {
    final /* synthetic */ Channel a;
    final /* synthetic */ cxuz b;

    public cxut(cxuz cxuzVar, Channel channel) {
        this.b = cxuzVar;
        this.a = channel;
    }

    @Override // defpackage.cxrh
    public final void a() {
        this.b.b.post(new cxus(this));
    }
}
