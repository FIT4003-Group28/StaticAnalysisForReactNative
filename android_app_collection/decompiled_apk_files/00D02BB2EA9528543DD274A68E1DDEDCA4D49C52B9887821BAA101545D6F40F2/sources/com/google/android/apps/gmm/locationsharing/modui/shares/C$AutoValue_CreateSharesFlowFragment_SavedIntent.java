package com.google.android.apps.gmm.locationsharing.modui.shares;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: com.google.android.apps.gmm.locationsharing.modui.shares.$AutoValue_CreateSharesFlowFragment_SavedIntent  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_CreateSharesFlowFragment_SavedIntent extends CreateSharesFlowFragment$SavedIntent {
    public final Intent a;
    public final String b;

    public C$AutoValue_CreateSharesFlowFragment_SavedIntent(Intent intent, String str) {
        if (intent != null) {
            this.a = intent;
            if (str != null) {
                this.b = str;
                return;
            }
            throw new NullPointerException("Null appName");
        }
        throw new NullPointerException("Null intent");
    }

    @Override // com.google.android.apps.gmm.locationsharing.modui.shares.CreateSharesFlowFragment$SavedIntent
    public final Intent a() {
        return this.a;
    }

    @Override // com.google.android.apps.gmm.locationsharing.modui.shares.CreateSharesFlowFragment$SavedIntent
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CreateSharesFlowFragment$SavedIntent) {
            CreateSharesFlowFragment$SavedIntent createSharesFlowFragment$SavedIntent = (CreateSharesFlowFragment$SavedIntent) obj;
            if (this.a.equals(createSharesFlowFragment$SavedIntent.a()) && this.b.equals(createSharesFlowFragment$SavedIntent.b())) {
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
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30 + str.length());
        sb.append("SavedIntent{intent=");
        sb.append(valueOf);
        sb.append(", appName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
