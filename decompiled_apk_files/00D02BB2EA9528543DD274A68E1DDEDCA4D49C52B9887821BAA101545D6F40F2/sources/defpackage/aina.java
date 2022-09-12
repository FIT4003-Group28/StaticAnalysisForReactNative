package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aina  reason: default package */
/* loaded from: classes2.dex */
public final class aina extends aioe {
    private final dbsg<aink> a;
    private final PersonId b;
    private final int c;

    public aina(dbsg<aink> dbsgVar, PersonId personId, int i) {
        this.a = dbsgVar;
        if (personId != null) {
            this.b = personId;
            this.c = i;
            return;
        }
        throw new NullPointerException("Null personId");
    }

    @Override // defpackage.aioe
    public final dbsg<aink> a() {
        return this.a;
    }

    @Override // defpackage.aioe
    public final PersonId b() {
        return this.b;
    }

    @Override // defpackage.aioe
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aioe) {
            aioe aioeVar = (aioe) obj;
            if (this.a.equals(aioeVar.a()) && this.b.equals(aioeVar.b()) && this.c == aioeVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int i = this.c;
        String str = i != 1 ? i != 2 ? "UPDATED" : "REMOVED" : "CREATED";
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47 + String.valueOf(valueOf2).length() + str.length());
        sb.append("UiModelModification{uiState=");
        sb.append(valueOf);
        sb.append(", personId=");
        sb.append(valueOf2);
        sb.append(", type=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
