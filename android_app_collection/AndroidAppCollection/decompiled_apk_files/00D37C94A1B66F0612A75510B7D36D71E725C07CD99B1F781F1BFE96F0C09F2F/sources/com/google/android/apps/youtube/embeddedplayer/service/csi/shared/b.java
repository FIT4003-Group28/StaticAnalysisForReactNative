package com.google.android.apps.youtube.embeddedplayer.service.csi.shared;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.SetOperationType;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.Tick;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b extends dvc implements d {
    public b(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.csi.shared.ICsiControllerService");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void a() {
        px(7, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void b() {
        throw null;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void c() {
        px(4, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void d(d dVar) {
        throw null;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void e(Tick tick, long j) {
        Parcel pv = pv();
        dve.g(pv, tick);
        pv.writeLong(j);
        px(6, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void f(Tick tick, long j) {
        Parcel pv = pv();
        dve.g(pv, tick);
        pv.writeLong(j);
        px(9, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void g(Tick tick, long j) {
        Parcel pv = pv();
        dve.g(pv, tick);
        pv.writeLong(j);
        px(3, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void h(long j) {
        Parcel pv = pv();
        pv.writeLong(j);
        px(5, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void i(long j) {
        Parcel pv = pv();
        pv.writeLong(j);
        px(8, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void j(SetOperationType setOperationType, long j) {
        Parcel pv = pv();
        dve.g(pv, setOperationType);
        pv.writeLong(j);
        px(1, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void k(SetOperationType setOperationType, long j) {
        Parcel pv = pv();
        dve.g(pv, setOperationType);
        pv.writeLong(j);
        px(2, pv);
    }
}
