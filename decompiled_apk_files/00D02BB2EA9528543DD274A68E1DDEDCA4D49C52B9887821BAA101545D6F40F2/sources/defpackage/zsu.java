package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: zsu  reason: default package */
/* loaded from: classes7.dex */
public final class zsu extends zso {
    private final int a;
    private final CharSequence b;
    private final String c;
    private final Rect d;
    private final dbty<Point> e;

    public zsu(int i, CharSequence charSequence, String str, Rect rect, dbty<Point> dbtyVar) {
        this.a = i;
        if (charSequence != null) {
            this.b = charSequence;
            if (str != null) {
                this.c = str;
                if (rect != null) {
                    this.d = rect;
                    this.e = dbtyVar;
                    return;
                }
                throw new NullPointerException("Null screenSpaceRect");
            }
            throw new NullPointerException("Null description");
        }
        throw new NullPointerException("Null text");
    }

    @Override // defpackage.zso
    public final int a() {
        return this.a;
    }

    @Override // defpackage.zso
    public final CharSequence b() {
        return this.b;
    }

    @Override // defpackage.zso
    public final String c() {
        return this.c;
    }

    @Override // defpackage.zso
    public final Rect d() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zso
    public final dbty<Point> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zso) {
            zso zsoVar = (zso) obj;
            if (this.a == zsoVar.a() && this.b.equals(zsoVar.b()) && this.c.equals(zsoVar.c()) && this.d.equals(zsoVar.d()) && this.e.equals(zsoVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        String str = this.c;
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = str.length();
        int length3 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_switchStyle + length2 + length3 + String.valueOf(valueOf3).length());
        sb.append("AccessibleRouteCallout{tripIndex=");
        sb.append(i);
        sb.append(", text=");
        sb.append(valueOf);
        sb.append(", description=");
        sb.append(str);
        sb.append(", screenSpaceRect=");
        sb.append(valueOf2);
        sb.append(", locationOffset=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
