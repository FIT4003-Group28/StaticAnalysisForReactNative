package defpackage;

import j$.time.Duration;
import j$.util.Optional;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aifi  reason: default package */
/* loaded from: classes.dex */
public final class aifi {
    public final boolean a;
    public final Duration b;
    public final Optional c;
    public final boolean d;

    public aifi(boolean z, Duration duration, Optional optional, boolean z2) {
        this.a = z;
        if (duration != null) {
            this.b = duration;
            this.c = optional;
            this.d = z2;
            return;
        }
        throw new NullPointerException("Null seekDuration");
    }

    public static aifi a(Duration duration) {
        return new aifi(false, duration, Optional.empty(), false);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aifi) {
            aifi aifiVar = (aifi) obj;
            if (this.a == aifiVar.a && this.b.equals(aifiVar.b) && this.c.equals(aifiVar.c) && this.d == aifiVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = ((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        if (true == this.d) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        boolean z2 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 99 + String.valueOf(valueOf2).length());
        sb.append("ChapterSeekResult{isSeekingToChapterStart=");
        sb.append(z);
        sb.append(", seekDuration=");
        sb.append(valueOf);
        sb.append(", seekText=");
        sb.append(valueOf2);
        sb.append(", isOverlayCentered=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }

    public aifi() {
    }
}
