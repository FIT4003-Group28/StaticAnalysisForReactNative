package com.google.ar.sceneform.animation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class AnimationEngine {
    private static AnimationEngine g;
    public final dbeo<dbei> a;
    public final dbeo<dbhx> b;
    public final dbeo<dbef> c;
    public final WeakHashMap<dbgt, dbdf> d;
    public final ArrayList<dbdf> e;
    public final HashSet<dbgt> f;

    private AnimationEngine() {
        dbeo<dbei> dbeoVar = new dbeo<>();
        this.a = dbeoVar;
        dbeo<dbhx> dbeoVar2 = new dbeo<>();
        this.b = dbeoVar2;
        dbeo<dbef> dbeoVar3 = new dbeo<>();
        this.c = dbeoVar3;
        this.d = new WeakHashMap<>();
        this.e = new ArrayList<>();
        this.f = new HashSet<>();
        dbhs.b().a(dbeoVar);
        dbhs.b().a(dbeoVar2);
        dbhs.b().a(dbeoVar3);
    }

    public static AnimationEngine a() {
        if (g == null) {
            g = new AnimationEngine();
        }
        return g;
    }

    public static native void advanceFrame(long j);

    public final void b(dbgt dbgtVar, dbdf dbdfVar) {
        if (dbgtVar == null) {
            return;
        }
        if (this.f.contains(dbgtVar)) {
            this.f.remove(dbgtVar);
        } else if (this.d.containsKey(dbgtVar)) {
            throw new IllegalStateException("Only one ModelAnimator may play on a ModelRenderable at a time");
        }
        this.d.put(dbgtVar, dbdfVar);
    }

    public final void c(dbgt dbgtVar) {
        if (dbgtVar == null) {
            return;
        }
        this.f.add(dbgtVar);
    }
}
