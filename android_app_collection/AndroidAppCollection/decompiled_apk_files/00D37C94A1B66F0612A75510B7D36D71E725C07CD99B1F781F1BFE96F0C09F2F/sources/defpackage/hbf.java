package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: hbf  reason: default package */
/* loaded from: classes3.dex */
public final class hbf {
    final int a;
    final ArrayList b = new ArrayList();
    hbe c;

    public hbf(int i) {
        this.a = i;
    }

    public final int a(int i) {
        this.c = null;
        if (i > this.a) {
            zep.b("Attempted StereoChannelMapper track add with track with more than 2 channels");
            return -1;
        }
        this.b.add(Integer.valueOf(i));
        return this.b.size() - 1;
    }
}
