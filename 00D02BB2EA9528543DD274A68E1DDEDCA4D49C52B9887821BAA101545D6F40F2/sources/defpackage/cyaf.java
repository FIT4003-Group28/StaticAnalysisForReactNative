package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.android.AndroidLibAutocompleteSession;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.SessionContext;
import com.google.android.libraries.social.populous.logging.LogEntity;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: cyaf  reason: default package */
/* loaded from: classes5.dex */
public final class cyaf implements Parcelable.Creator<AndroidLibAutocompleteSession> {
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.libraries.social.populous.android.AndroidLibAutocompleteSession, cxye] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AndroidLibAutocompleteSession createFromParcel(Parcel parcel) {
        ClientConfigInternal clientConfigInternal = (ClientConfigInternal) parcel.readParcelable(ClientConfigInternal.class.getClassLoader());
        boolean z = parcel.readByte() != 0;
        String readString = parcel.readString();
        SessionContext sessionContext = (SessionContext) parcel.readParcelable(SessionContext.class.getClassLoader());
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        long readLong3 = parcel.readLong();
        boolean z2 = parcel.readByte() != 0;
        boolean z3 = parcel.readByte() != 0;
        Integer num = (Integer) parcel.readValue(Integer.class.getClassLoader());
        Long l = (Long) parcel.readValue(Long.class.getClassLoader());
        Bundle readBundle = parcel.readBundle(cypb.class.getClassLoader());
        cypb cypbVar = new cypb();
        for (String str : readBundle.keySet()) {
            Long l2 = l;
            cypbVar.put(str, (LogEntity) readBundle.getParcelable(str));
            l = l2;
            readBundle = readBundle;
        }
        Long l3 = l;
        cypbVar.a = num;
        HashMap hashMap = (HashMap) parcel.readSerializable();
        ?? i = cybo.i(clientConfigInternal, readString, sessionContext, null, cypbVar, z);
        AndroidLibAutocompleteSession androidLibAutocompleteSession = (AndroidLibAutocompleteSession) i;
        androidLibAutocompleteSession.j.putAll(hashMap);
        androidLibAutocompleteSession.o = readLong;
        androidLibAutocompleteSession.p = readLong2;
        androidLibAutocompleteSession.q = readLong3;
        androidLibAutocompleteSession.r = z2;
        androidLibAutocompleteSession.s = z3;
        androidLibAutocompleteSession.t = num;
        androidLibAutocompleteSession.n = l3;
        return i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AndroidLibAutocompleteSession[] newArray(int i) {
        return new AndroidLibAutocompleteSession[i];
    }
}
