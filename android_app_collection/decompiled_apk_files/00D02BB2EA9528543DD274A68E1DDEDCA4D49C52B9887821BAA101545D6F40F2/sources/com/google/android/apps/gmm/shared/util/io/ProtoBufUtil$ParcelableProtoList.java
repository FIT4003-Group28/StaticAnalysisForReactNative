package com.google.android.apps.gmm.shared.util.io;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dssj;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ProtoBufUtil$ParcelableProtoList<T extends dssj> implements Parcelable {
    public static final Parcelable.Creator<ProtoBufUtil$ParcelableProtoList<? extends dssj>> CREATOR = new bvrr();
    @dzsi
    private List<T> a;
    @dzsi
    private byte[] b;
    private int c;

    public ProtoBufUtil$ParcelableProtoList(List<T> list) {
        this.a = list;
        this.b = null;
        this.c = list.size();
    }

    public ProtoBufUtil$ParcelableProtoList(byte[] bArr, int i) {
        this.a = null;
        this.b = bArr;
        this.c = i;
    }

    public final List<T> a(dssr<T> dssrVar) {
        if (b()) {
            return Collections.emptyList();
        }
        if (this.a == null) {
            byte[] bArr = this.b;
            if (bArr == null) {
                this.c = -1;
                return Collections.emptyList();
            }
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                this.a = new ArrayList(this.c);
                for (int i = 0; i < this.c; i++) {
                    this.a.add(dssrVar.f(byteArrayInputStream));
                }
            } catch (IOException unused) {
                this.c = -1;
                return Collections.emptyList();
            }
        }
        return this.a;
    }

    public final boolean b() {
        return this.c == -1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.b == null) {
            if (this.a == null) {
                this.c = -1;
                return;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                for (T t : this.a) {
                    t.bU(byteArrayOutputStream);
                }
                this.b = byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                this.c = -1;
            }
        }
        if (!b()) {
            parcel.writeInt(this.a.size());
            parcel.writeInt(this.b.length);
            parcel.writeByteArray(this.b);
        }
    }
}
