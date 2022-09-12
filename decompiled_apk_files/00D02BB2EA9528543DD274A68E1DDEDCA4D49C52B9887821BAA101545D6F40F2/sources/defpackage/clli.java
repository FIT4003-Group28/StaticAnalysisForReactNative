package defpackage;

import java.io.Closeable;
import java.nio.channels.WritableByteChannel;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: clli  reason: default package */
/* loaded from: classes5.dex */
public interface clli extends Closeable {
    int a();

    Map<String, List<String>> b();

    dehn<Long> c(WritableByteChannel writableByteChannel);
}
