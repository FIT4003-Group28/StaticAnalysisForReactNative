package com.horcrux.svg;

import com.facebook.react.bridge.an;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FontData.java */
/* loaded from: classes.dex */
public class i {
    static final i n = new i();

    /* renamed from: a  reason: collision with root package name */
    final double f4864a;

    /* renamed from: b  reason: collision with root package name */
    final String f4865b;

    /* renamed from: c  reason: collision with root package name */
    final j f4866c;

    /* renamed from: d  reason: collision with root package name */
    final an f4867d;
    final l e;
    final String f;
    final k g;
    final ab h;
    final ac i;
    final double j;
    final double k;
    final double l;
    final boolean m;

    private i() {
        this.f4867d = null;
        this.f4865b = "";
        this.f4866c = j.normal;
        this.e = l.Normal;
        this.f = "";
        this.g = k.normal;
        this.h = ab.start;
        this.i = ac.None;
        this.m = false;
        this.j = 0.0d;
        this.f4864a = 12.0d;
        this.k = 0.0d;
        this.l = 0.0d;
    }

    private double a(String str, double d2, double d3) {
        return w.a(str, 0.0d, 0.0d, d2, d3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(an anVar, i iVar, double d2) {
        double d3 = iVar.f4864a;
        if (anVar.hasKey("fontSize")) {
            this.f4864a = w.a(anVar.getString("fontSize"), d3, 0.0d, 1.0d, d3);
        } else {
            this.f4864a = d3;
        }
        this.f4867d = anVar.hasKey("fontData") ? anVar.d("fontData") : iVar.f4867d;
        this.f4865b = anVar.hasKey("fontFamily") ? anVar.getString("fontFamily") : iVar.f4865b;
        this.f4866c = anVar.hasKey("fontStyle") ? j.valueOf(anVar.getString("fontStyle")) : iVar.f4866c;
        this.e = anVar.hasKey("fontWeight") ? l.a(anVar.getString("fontWeight")) : iVar.e;
        this.f = anVar.hasKey("fontFeatureSettings") ? anVar.getString("fontFeatureSettings") : iVar.f;
        this.g = anVar.hasKey("fontVariantLigatures") ? k.valueOf(anVar.getString("fontVariantLigatures")) : iVar.g;
        this.h = anVar.hasKey("textAnchor") ? ab.valueOf(anVar.getString("textAnchor")) : iVar.h;
        this.i = anVar.hasKey("textDecoration") ? ac.a(anVar.getString("textDecoration")) : iVar.i;
        boolean hasKey = anVar.hasKey("kerning");
        this.m = hasKey || iVar.m;
        this.j = hasKey ? a(anVar.getString("kerning"), d2, this.f4864a) : iVar.j;
        this.k = anVar.hasKey("wordSpacing") ? a(anVar.getString("wordSpacing"), d2, this.f4864a) : iVar.k;
        this.l = anVar.hasKey("letterSpacing") ? a(anVar.getString("letterSpacing"), d2, this.f4864a) : iVar.l;
    }
}
