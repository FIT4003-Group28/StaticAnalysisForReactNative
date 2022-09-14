package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class zzv extends com.google.android.gms.analytics.zzi<zzv> {
    private String name;
    private String zzno;
    private String zztk;
    private String zztl;
    private String zztm;
    private String zztn;
    private String zzto;
    private String zztp;
    private String zztq;
    private String zztr;

    public final String getId() {
        return this.zzno;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSource() {
        return this.zztk;
    }

    public final void setId(String str) {
        this.zzno = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("name", this.name);
        hashMap.put("source", this.zztk);
        hashMap.put("medium", this.zztl);
        hashMap.put("keyword", this.zztm);
        hashMap.put("content", this.zztn);
        hashMap.put("id", this.zzno);
        hashMap.put("adNetworkId", this.zzto);
        hashMap.put("gclid", this.zztp);
        hashMap.put("dclid", this.zztq);
        hashMap.put("aclid", this.zztr);
        return zza((Object) hashMap);
    }

    public final String zzaj() {
        return this.zztl;
    }

    public final String zzak() {
        return this.zztm;
    }

    public final String zzal() {
        return this.zztn;
    }

    public final String zzam() {
        return this.zzto;
    }

    public final String zzan() {
        return this.zztp;
    }

    public final String zzao() {
        return this.zztq;
    }

    public final String zzap() {
        return this.zztr;
    }

    @Override // com.google.android.gms.analytics.zzi
    public final /* synthetic */ void zzb(zzv zzvVar) {
        zzv zzvVar2 = zzvVar;
        if (!TextUtils.isEmpty(this.name)) {
            zzvVar2.name = this.name;
        }
        if (!TextUtils.isEmpty(this.zztk)) {
            zzvVar2.zztk = this.zztk;
        }
        if (!TextUtils.isEmpty(this.zztl)) {
            zzvVar2.zztl = this.zztl;
        }
        if (!TextUtils.isEmpty(this.zztm)) {
            zzvVar2.zztm = this.zztm;
        }
        if (!TextUtils.isEmpty(this.zztn)) {
            zzvVar2.zztn = this.zztn;
        }
        if (!TextUtils.isEmpty(this.zzno)) {
            zzvVar2.zzno = this.zzno;
        }
        if (!TextUtils.isEmpty(this.zzto)) {
            zzvVar2.zzto = this.zzto;
        }
        if (!TextUtils.isEmpty(this.zztp)) {
            zzvVar2.zztp = this.zztp;
        }
        if (!TextUtils.isEmpty(this.zztq)) {
            zzvVar2.zztq = this.zztq;
        }
        if (!TextUtils.isEmpty(this.zztr)) {
            zzvVar2.zztr = this.zztr;
        }
    }

    public final void zzc(String str) {
        this.zztk = str;
    }

    public final void zzd(String str) {
        this.zztl = str;
    }

    public final void zze(String str) {
        this.zztm = str;
    }

    public final void zzf(String str) {
        this.zztn = str;
    }

    public final void zzg(String str) {
        this.zzto = str;
    }

    public final void zzh(String str) {
        this.zztp = str;
    }

    public final void zzi(String str) {
        this.zztq = str;
    }

    public final void zzj(String str) {
        this.zztr = str;
    }
}
