package com.google.android.apps.gmm.directions.transitlinespace;
/* compiled from: PG */
/* renamed from: com.google.android.apps.gmm.directions.transitlinespace.$AutoValue_TransitLineSpaceFragment_LineSpaceFragmentInstanceState  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_TransitLineSpaceFragment_LineSpaceFragmentInstanceState extends TransitLineSpaceFragment$LineSpaceFragmentInstanceState {
    public final akqi a;

    public C$AutoValue_TransitLineSpaceFragment_LineSpaceFragmentInstanceState(@dzsi akqi akqiVar) {
        this.a = akqiVar;
    }

    @Override // com.google.android.apps.gmm.directions.transitlinespace.TransitLineSpaceFragment$LineSpaceFragmentInstanceState
    @dzsi
    public final akqi a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TransitLineSpaceFragment$LineSpaceFragmentInstanceState)) {
            return false;
        }
        TransitLineSpaceFragment$LineSpaceFragmentInstanceState transitLineSpaceFragment$LineSpaceFragmentInstanceState = (TransitLineSpaceFragment$LineSpaceFragmentInstanceState) obj;
        akqi akqiVar = this.a;
        return akqiVar == null ? transitLineSpaceFragment$LineSpaceFragmentInstanceState.a() == null : akqiVar.equals(transitLineSpaceFragment$LineSpaceFragmentInstanceState.a());
    }

    public final int hashCode() {
        akqi akqiVar = this.a;
        return (akqiVar == null ? 0 : akqiVar.hashCode()) ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
        sb.append("LineSpaceFragmentInstanceState{selectedStation=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
