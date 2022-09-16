package com.google.android.libraries.youtube.player.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class PlaybackStartDescriptor implements Parcelable {
    public static final Parcelable.Creator CREATOR = new abjw(20);
    public ory a;
    public apzg b;
    public String c;
    public int d;
    public final int e;

    public PlaybackStartDescriptor(ory oryVar, int i, apzg apzgVar) {
        this.a = oryVar;
        this.e = i;
        this.b = apzgVar;
    }

    public static aijl d() {
        return new aijl();
    }

    public final int A() {
        int ao = akel.ao(this.a.y);
        if (ao == 0) {
            return 1;
        }
        return ao;
    }

    public final int a() {
        return this.a.f;
    }

    public final int b() {
        return Math.max(0, a());
    }

    public final long c() {
        return this.a.l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final aijl e() {
        aijl aijlVar = new aijl();
        aijlVar.m = this.a;
        aijlVar.a = this.b;
        aijlVar.p = this.e;
        return aijlVar;
    }

    public final ampq f() {
        ory oryVar = this.a;
        if ((oryVar.b & 262144) != 0) {
            attz attzVar = oryVar.s;
            if (attzVar == null) {
                attzVar = attz.a;
            }
            return ampq.j(attzVar);
        }
        return amon.a;
    }

    public final String g(zey zeyVar) {
        String h = h(zeyVar);
        this.c = null;
        return h;
    }

    public final String h(zey zeyVar) {
        if (this.c == null) {
            this.c = zeyVar.a();
        }
        return this.c;
    }

    public final String i() {
        return this.a.g;
    }

    public final String j() {
        return this.a.m;
    }

    public final String k() {
        return this.a.e;
    }

    public final String l() {
        return this.a.c;
    }

    public final List m() {
        if (this.a.d.size() > 0) {
            return this.a.d;
        }
        return null;
    }

    public final Map n() {
        return Collections.unmodifiableMap(this.a.x);
    }

    public final void o(PlaybackStartDescriptor playbackStartDescriptor) {
        if (playbackStartDescriptor == null || playbackStartDescriptor == this) {
            return;
        }
        this.c = playbackStartDescriptor.c;
        playbackStartDescriptor.c = null;
    }

    public final void p(boolean z) {
        aopa mo52toBuilder = this.a.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        ory oryVar = (ory) mo52toBuilder.instance;
        oryVar.b |= 1024;
        oryVar.n = z;
        this.a = (ory) mo52toBuilder.mo39build();
    }

    public final void q(long j) {
        aopa mo52toBuilder = this.a.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        ory oryVar = (ory) mo52toBuilder.instance;
        oryVar.b |= 256;
        oryVar.l = j;
        this.a = (ory) mo52toBuilder.mo39build();
    }

    public final boolean r() {
        return this.a.v;
    }

    public final boolean s() {
        return this.a.u;
    }

    public final boolean t() {
        return this.a.i;
    }

    public final String toString() {
        List m = m();
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[4];
        objArr[0] = l();
        objArr[1] = k();
        objArr[2] = Integer.valueOf(a());
        objArr[3] = m != null ? m.toString() : "";
        return String.format(locale, "PlaybackStartDescriptor:\n  VideoId:%s\n  PlaylistId:%s\n  Index:%d\n  VideoIds:%s", objArr);
    }

    public final boolean u() {
        return this.a.p;
    }

    public final boolean v() {
        return this.a.j;
    }

    public final boolean w() {
        return !this.a.o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a.toByteArray());
        parcel.writeString(this.c);
    }

    public final boolean x() {
        return this.a.n;
    }

    public final byte[] y() {
        return this.a.h.I();
    }

    public final byte[] z() {
        return this.a.B.I();
    }
}
