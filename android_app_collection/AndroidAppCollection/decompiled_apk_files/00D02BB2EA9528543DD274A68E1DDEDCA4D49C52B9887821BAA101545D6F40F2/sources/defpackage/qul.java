package defpackage;

import android.support.v4.app.Fragment$SavedState;
import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: qul  reason: default package */
/* loaded from: classes7.dex */
public final class qul extends qux {
    public final quy a;
    public final quw b;
    public final Fragment$SavedState c;
    public final long d;

    public qul(quy quyVar, @dzsi quw quwVar, Fragment$SavedState fragment$SavedState, long j) {
        this.a = quyVar;
        this.b = quwVar;
        this.c = fragment$SavedState;
        this.d = j;
    }

    @Override // defpackage.qux
    public final quy a() {
        return this.a;
    }

    @Override // defpackage.qux
    @dzsi
    public final quw b() {
        return this.b;
    }

    @Override // defpackage.qux
    public final Fragment$SavedState c() {
        return this.c;
    }

    @Override // defpackage.qux
    public final long d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        quw quwVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qux) {
            qux quxVar = (qux) obj;
            if (this.a.equals(quxVar.a()) && ((quwVar = this.b) != null ? quwVar.equals(quxVar.b()) : quxVar.b() == null) && this.c.equals(quxVar.c()) && this.d == quxVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        quw quwVar = this.b;
        int hashCode2 = quwVar == null ? 0 : quwVar.hashCode();
        int hashCode3 = this.c.hashCode();
        long j = this.d;
        return ((((hashCode ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        long j = this.d;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_textAppearanceSearchResultTitle + length2 + String.valueOf(valueOf3).length());
        sb.append("CommuteHubSavedState{commuteHubState=");
        sb.append(valueOf);
        sb.append(", manualDirective=");
        sb.append(valueOf2);
        sb.append(", savedFragmentState=");
        sb.append(valueOf3);
        sb.append(", saveTime=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
