package defpackage;

import android.content.IntentFilter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.List;
/* compiled from: PG */
/* renamed from: cpjy  reason: default package */
/* loaded from: classes5.dex */
public final class cpjy<T> extends cpiw {
    public cnsd<cpgo> a;
    public final IntentFilter[] b;

    public cpjy(IntentFilter[] intentFilterArr) {
        this.b = intentFilterArr;
    }

    @Override // defpackage.cpix
    public final void b(DataHolder dataHolder) {
        dataHolder.close();
    }

    @Override // defpackage.cpix
    public final void c(MessageEventParcelable messageEventParcelable) {
    }

    @Override // defpackage.cpix
    public final void d(List<NodeParcelable> list) {
        cnsd<cpgo> cnsdVar = this.a;
        if (cnsdVar != null) {
            cnsdVar.a(new cpjx(list));
        }
    }

    @Override // defpackage.cpix
    public final void e(ChannelEventParcelable channelEventParcelable) {
    }

    @Override // defpackage.cpix
    public final void f(MessageEventParcelable messageEventParcelable, cpis cpisVar) {
    }

    @Override // defpackage.cpix
    public final void g() {
    }

    @Override // defpackage.cpix
    public final void h() {
    }

    @Override // defpackage.cpix
    public final void i() {
    }

    @Override // defpackage.cpix
    public final void j() {
    }

    @Override // defpackage.cpix
    public final void k() {
    }
}
