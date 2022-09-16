package defpackage;

import j$.time.Duration;
/* compiled from: PG */
/* renamed from: adis  reason: default package */
/* loaded from: classes.dex */
public final class adis extends adhy {
    public final Duration b;

    public adis(String str, int i, Duration duration) {
        super(str, i);
        this.b = duration;
    }

    @Override // defpackage.adit
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        return this.b.equals(((adis) obj).b);
    }
}
