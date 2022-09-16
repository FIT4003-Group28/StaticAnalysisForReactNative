package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: aiht  reason: default package */
/* loaded from: classes.dex */
public final class aiht {
    public final Bitmap a;
    private final Rect b;

    public aiht() {
    }

    public aiht(Bitmap bitmap, Rect rect) {
        this.a = bitmap;
        this.b = rect;
    }

    public static aiht a(Bitmap bitmap) {
        return new aiht(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aiht) {
            aiht aihtVar = (aiht) obj;
            if (this.a.equals(aihtVar.a) && this.b.equals(aihtVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31 + String.valueOf(valueOf2).length());
        sb.append("StoryboardFrame{mosaic=");
        sb.append(valueOf);
        sb.append(", rect=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
