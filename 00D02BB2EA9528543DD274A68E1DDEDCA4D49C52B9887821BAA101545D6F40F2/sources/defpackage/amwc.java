package defpackage;

import java.util.EnumMap;
/* compiled from: PG */
/* renamed from: amwc  reason: default package */
/* loaded from: classes2.dex */
public final class amwc {
    public static final EnumMap<doyd, ddho> a;
    public static final EnumMap<doyd, ddho> b;
    public static final dcaz<doyd, dwnk> c;
    private static final dcqe d = dcqe.c("amwc");

    static {
        EnumMap<doyd, ddho> k = dcjz.k(doyd.class);
        a = k;
        EnumMap<doyd, ddho> k2 = dcjz.k(doyd.class);
        b = k2;
        dcaz<doyd, dwnk> k3 = dcaz.k(doyd.class, dwnk.class);
        c = k3;
        k.put((EnumMap<doyd, ddho>) doyd.INCIDENT_ACCIDENT, (doyd) dtyi.cv);
        k.put((EnumMap<doyd, ddho>) doyd.INCIDENT_CONSTRUCTION, (doyd) dtyi.cw);
        k.put((EnumMap<doyd, ddho>) doyd.INCIDENT_OTHER, (doyd) dtyi.cA);
        k.put((EnumMap<doyd, ddho>) doyd.INCIDENT_ROAD_CLOSED, (doyd) dtyi.cD);
        k.put((EnumMap<doyd, ddho>) doyd.INCIDENT_JAM, (doyd) dtyi.cA);
        k.put((EnumMap<doyd, ddho>) doyd.INCIDENT_SPEED_CAMERA, (doyd) dtyi.cF);
        k.put((EnumMap<doyd, ddho>) doyd.INCIDENT_SPEED_TRAP, (doyd) dtyi.cG);
        k.put((EnumMap<doyd, ddho>) doyd.INCIDENT_SUSPECTED_JAM, (doyd) dtyi.cA);
        k.put((EnumMap<doyd, ddho>) doyd.INCIDENT_SUSPECTED_CLOSURE, (doyd) dtyi.cI);
        k.put((EnumMap<doyd, ddho>) doyd.INCIDENT_LANE_CLOSURE, (doyd) dtyi.cB);
        k.put((EnumMap<doyd, ddho>) doyd.INCIDENT_STALLED_VEHICLE, (doyd) dtyi.cH);
        k.put((EnumMap<doyd, ddho>) doyd.INCIDENT_OBJECT_ON_ROAD, (doyd) dtyi.cC);
        k.put((EnumMap<doyd, ddho>) doyd.INCIDENT_ICE, (doyd) dtyi.cz);
        k.put((EnumMap<doyd, ddho>) doyd.INCIDENT_SNOW, (doyd) dtyi.cE);
        k.put((EnumMap<doyd, ddho>) doyd.INCIDENT_FOG, (doyd) dtyi.cy);
        k.put((EnumMap<doyd, ddho>) doyd.INCIDENT_FLOOD, (doyd) dtyi.cx);
        k2.put((EnumMap<doyd, ddho>) doyd.INCIDENT_ACCIDENT, (doyd) dtyi.a);
        k2.put((EnumMap<doyd, ddho>) doyd.INCIDENT_CONSTRUCTION, (doyd) dtyi.c);
        k2.put((EnumMap<doyd, ddho>) doyd.INCIDENT_OTHER, (doyd) dtyi.g);
        k2.put((EnumMap<doyd, ddho>) doyd.INCIDENT_ROAD_CLOSED, (doyd) dtyi.j);
        k2.put((EnumMap<doyd, ddho>) doyd.INCIDENT_JAM, (doyd) dtyi.g);
        k2.put((EnumMap<doyd, ddho>) doyd.INCIDENT_SPEED_CAMERA, (doyd) dtyi.l);
        k2.put((EnumMap<doyd, ddho>) doyd.INCIDENT_SPEED_TRAP, (doyd) dtyi.m);
        k2.put((EnumMap<doyd, ddho>) doyd.INCIDENT_SUSPECTED_JAM, (doyd) dtyi.g);
        k2.put((EnumMap<doyd, ddho>) doyd.INCIDENT_SUSPECTED_CLOSURE, (doyd) dtyi.o);
        k2.put((EnumMap<doyd, ddho>) doyd.INCIDENT_LANE_CLOSURE, (doyd) dtyi.h);
        k2.put((EnumMap<doyd, ddho>) doyd.INCIDENT_STALLED_VEHICLE, (doyd) dtyi.n);
        k2.put((EnumMap<doyd, ddho>) doyd.INCIDENT_OBJECT_ON_ROAD, (doyd) dtyi.i);
        k2.put((EnumMap<doyd, ddho>) doyd.INCIDENT_ICE, (doyd) dtyi.f);
        k2.put((EnumMap<doyd, ddho>) doyd.INCIDENT_SNOW, (doyd) dtyi.k);
        k2.put((EnumMap<doyd, ddho>) doyd.INCIDENT_FOG, (doyd) dtyi.e);
        k2.put((EnumMap<doyd, ddho>) doyd.INCIDENT_FLOOD, (doyd) dtyi.d);
        k2.put((EnumMap<doyd, ddho>) doyd.INCIDENT_CHECKPOINT, (doyd) dtyi.b);
        k3.put(doyd.INCIDENT_ACCIDENT, dwnk.INCIDENT_ACCIDENT);
        k3.put(doyd.INCIDENT_CONSTRUCTION, dwnk.INCIDENT_CONSTRUCTION);
        k3.put(doyd.INCIDENT_OTHER, dwnk.INCIDENT_OTHER);
        k3.put(doyd.INCIDENT_ROAD_CLOSED, dwnk.INCIDENT_ROAD_CLOSED);
        k3.put(doyd.INCIDENT_JAM, dwnk.INCIDENT_JAM);
        k3.put(doyd.INCIDENT_SPEED_TRAP, dwnk.INCIDENT_SPEED_TRAP);
        k3.put(doyd.INCIDENT_SPEED_CAMERA, dwnk.INCIDENT_SPEED_CAMERA);
        k3.put(doyd.INCIDENT_SUSPECTED_JAM, dwnk.INCIDENT_SUSPECTED_JAM);
        k3.put(doyd.INCIDENT_SUSPECTED_CLOSURE, dwnk.INCIDENT_SUSPECTED_CLOSURE);
        k3.put(doyd.INCIDENT_LANE_CLOSURE, dwnk.INCIDENT_LANE_CLOSURE);
        k3.put(doyd.INCIDENT_STALLED_VEHICLE, dwnk.INCIDENT_STALLED_VEHICLE);
        k3.put(doyd.INCIDENT_OBJECT_ON_ROAD, dwnk.INCIDENT_OBJECT_ON_ROAD);
        k3.put(doyd.INCIDENT_ICE, dwnk.INCIDENT_ICE);
        k3.put(doyd.INCIDENT_SNOW, dwnk.INCIDENT_SNOW);
        k3.put(doyd.INCIDENT_FOG, dwnk.INCIDENT_FOG);
        k3.put(doyd.INCIDENT_FLOOD, dwnk.INCIDENT_FLOOD);
        k3.put(doyd.INCIDENT_CHECKPOINT, dwnk.INCIDENT_CHECKPOINT);
    }

    @dzsi
    public static dwnl a(dozz dozzVar, vtn vtnVar) {
        doze dozeVar;
        doze dozeVar2;
        if (vtnVar == null) {
            bvoo.h("iconManager is empty.", new Object[0]);
            return null;
        }
        int i = dozzVar.a;
        if ((2097152 & i) == 0 || (8388608 & i) == 0 || (i & 16777216) == 0) {
            bvoo.h("Traffic incident notice missing ID or icon, ignoring.", new Object[0]);
            return null;
        }
        long d2 = decu.d(dozzVar.s);
        vtj vtjVar = vtj.INCIDENT_LIGHT;
        douj doujVar = dozzVar.u;
        if (doujVar == null) {
            doujVar = douj.h;
        }
        String a2 = vtnVar.a(doujVar.c, vtjVar);
        douj doujVar2 = dozzVar.v;
        if (doujVar2 == null) {
            doujVar2 = douj.h;
        }
        String a3 = vtnVar.a(doujVar2.c, vtjVar);
        if (a2 == null || a3 == null) {
            return null;
        }
        doyd b2 = doyd.b(dozzVar.t);
        if (b2 == null) {
            b2 = doyd.INCIDENT_OTHER;
        }
        dnoh dnohVar = dozzVar.q;
        if (dnohVar == null) {
            dnohVar = dnoh.d;
        }
        akqq e = akqq.e(dnohVar);
        dnoh dnohVar2 = dozzVar.r;
        if (dnohVar2 == null) {
            dnohVar2 = dnoh.d;
        }
        akqq e2 = akqq.e(dnohVar2);
        if (dozzVar.b == 18) {
            dozeVar = (doze) dozzVar.c;
        } else {
            dozeVar = doze.d;
        }
        int i2 = dozeVar.b;
        if (dozzVar.b == 18) {
            dozeVar2 = (doze) dozzVar.c;
        } else {
            dozeVar2 = doze.d;
        }
        int i3 = dozeVar2.c;
        String str = dozzVar.g;
        String str2 = dozzVar.i;
        dpad dpadVar = dozzVar.x;
        if (dpadVar == null) {
            dpadVar = dpad.e;
        }
        dbsk.s(b2);
        dwzq s = e.s();
        dwzq s2 = e2.s();
        dwnk dwnkVar = (dwnk) c.get(b2);
        if (dwnkVar == null) {
            dwnkVar = dwnk.INCIDENT_OTHER;
        }
        dwni bZ = dwnl.y.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwnl dwnlVar = (dwnl) bZ.b;
        int i4 = dwnlVar.a | 1;
        dwnlVar.a = i4;
        dwnlVar.b = d2;
        dwnlVar.c = dwnkVar.s;
        int i5 = i4 | 2;
        dwnlVar.a = i5;
        s.getClass();
        dwnlVar.d = s;
        int i6 = i5 | 4;
        dwnlVar.a = i6;
        s2.getClass();
        dwnlVar.e = s2;
        int i7 = i6 | 8;
        dwnlVar.a = i7;
        int i8 = i7 | 16;
        dwnlVar.a = i8;
        dwnlVar.f = i2;
        int i9 = i8 | 32;
        dwnlVar.a = i9;
        dwnlVar.g = i3;
        a2.getClass();
        int i10 = i9 | 512;
        dwnlVar.a = i10;
        dwnlVar.k = a2;
        a3.getClass();
        int i11 = i10 | 1024;
        dwnlVar.a = i11;
        dwnlVar.l = a3;
        str2.getClass();
        int i12 = i11 | 64;
        dwnlVar.a = i12;
        dwnlVar.h = str2;
        str.getClass();
        int i13 = i12 | 2048;
        dwnlVar.a = i13;
        dwnlVar.m = str;
        dpadVar.getClass();
        dwnlVar.o = dpadVar;
        dwnlVar.a = i13 | 8192;
        return bZ.bK();
    }

    public static dqkr b(doyd doydVar) {
        doyd doydVar2 = doyd.INCIDENT_ROAD_CLOSED;
        switch (doydVar.ordinal()) {
            case 0:
                return dqkr.INCIDENT_ROAD_CLOSED;
            case 1:
                return dqkr.INCIDENT_CRASH;
            case 2:
                return dqkr.INCIDENT_CONSTRUCTION;
            case 3:
            default:
                return dqkr.UNKNOWN_INCIDENT_TYPE;
            case 4:
                return dqkr.INCIDENT_MOBILE_CAMERA;
            case 5:
                return dqkr.INCIDENT_FIXED_CAMERA;
            case 6:
                return dqkr.INCIDENT_SUSPECTED_JAM;
            case 7:
                return dqkr.INCIDENT_SPEED_LIMIT;
            case 8:
                return dqkr.INCIDENT_SUSPECTED_CLOSURE;
            case 9:
                return dqkr.INCIDENT_LANE_CLOSURE;
            case 10:
                return dqkr.INCIDENT_STALLED_VEHICLE;
            case 11:
                return dqkr.INCIDENT_OBJECT_ON_ROAD;
            case 12:
                return dqkr.INCIDENT_ICE;
            case 13:
                return dqkr.INCIDENT_SNOW;
            case 14:
                return dqkr.INCIDENT_FOG;
            case 15:
                return dqkr.INCIDENT_FLOOD;
        }
    }
}
