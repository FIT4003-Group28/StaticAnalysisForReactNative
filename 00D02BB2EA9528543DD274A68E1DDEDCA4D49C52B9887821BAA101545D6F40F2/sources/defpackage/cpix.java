package defpackage;

import android.os.IInterface;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.List;
/* compiled from: PG */
/* renamed from: cpix  reason: default package */
/* loaded from: classes5.dex */
public interface cpix extends IInterface {
    void b(DataHolder dataHolder);

    void c(MessageEventParcelable messageEventParcelable);

    void d(List<NodeParcelable> list);

    void e(ChannelEventParcelable channelEventParcelable);

    void f(MessageEventParcelable messageEventParcelable, cpis cpisVar);

    void g();

    void h();

    void i();

    void j();

    void k();
}
