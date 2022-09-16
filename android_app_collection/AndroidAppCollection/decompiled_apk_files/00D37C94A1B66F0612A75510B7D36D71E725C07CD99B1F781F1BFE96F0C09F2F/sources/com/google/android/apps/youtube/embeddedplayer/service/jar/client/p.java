package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class p extends dvc implements r {
    public p(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.jar.client.IApiPlayerClient");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final String a(String str) {
        Parcel pv = pv();
        pv.writeString(str);
        Parcel pw = pw(20, pv);
        String readString = pw.readString();
        pw.recycle();
        return readString;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void f() {
        px(6, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void g(boolean z, long j) {
        Parcel pv = pv();
        dve.e(pv, z);
        pv.writeLong(j);
        px(14, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void h() {
        px(19, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void i() {
        px(18, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void j(String str) {
        Parcel pv = pv();
        pv.writeString(str);
        px(9, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void k(boolean z) {
        Parcel pv = pv();
        dve.e(pv, z);
        px(16, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void l(String str, String str2, long j, long j2, boolean z, boolean z2, int i) {
        Parcel pv = pv();
        pv.writeString(str);
        pv.writeString(str2);
        pv.writeLong(j);
        pv.writeLong(j2);
        dve.e(pv, z);
        dve.e(pv, z2);
        pv.writeInt(i);
        px(5, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void m() {
        px(4, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void n() {
        px(2, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void o(long j) {
        Parcel pv = pv();
        pv.writeLong(j);
        px(11, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void p(long j, long j2) {
        Parcel pv = pv();
        pv.writeLong(j);
        pv.writeLong(j2);
        px(10, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void q() {
        px(17, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void r() {
        px(3, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void s() {
        px(1, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void t(long j, long j2) {
        Parcel pv = pv();
        pv.writeLong(j);
        pv.writeLong(j2);
        px(13, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void u(long j) {
        Parcel pv = pv();
        pv.writeLong(j);
        px(15, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void v() {
        px(12, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void w() {
        px(8, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void x() {
        px(7, pv());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void y(String str) {
        Parcel pv = pv();
        pv.writeString(str);
        px(22, pv);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.r
    public final void z(Intent intent) {
        Parcel pv = pv();
        dve.g(pv, intent);
        px(21, pv);
    }
}
