package defpackage;

import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxug  reason: default package */
/* loaded from: classes5.dex */
public final class cxug implements cxrh {
    final /* synthetic */ Channel a;
    final /* synthetic */ cxui b;

    public cxug(cxui cxuiVar, Channel channel) {
        this.b = cxuiVar;
        this.a = channel;
    }

    @Override // defpackage.cxrh
    public final void a() {
        this.b.b.post(new cxuf(this));
    }
}
