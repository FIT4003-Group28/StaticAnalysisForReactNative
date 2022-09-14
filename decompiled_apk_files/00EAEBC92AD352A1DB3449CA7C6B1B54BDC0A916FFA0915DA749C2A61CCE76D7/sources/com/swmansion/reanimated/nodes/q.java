package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.c0;
import com.facebook.react.uimanager.o0;
import java.util.Map;
/* loaded from: classes.dex */
public class q extends m implements j {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Integer> f10020a;

    /* renamed from: b  reason: collision with root package name */
    private final o0 f10021b;

    /* renamed from: c  reason: collision with root package name */
    private int f10022c;

    /* renamed from: d  reason: collision with root package name */
    private final JavaOnlyMap f10023d;

    /* renamed from: e  reason: collision with root package name */
    private final c0 f10024e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10025a = new int[ReadableType.values().length];

        static {
            try {
                f10025a[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10025a[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10025a[ReadableType.Array.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public q(int i, ReadableMap readableMap, com.swmansion.reanimated.b bVar, o0 o0Var) {
        super(i, readableMap, bVar);
        this.f10022c = -1;
        this.f10020a = com.swmansion.reanimated.e.a(readableMap.mo210getMap("props"));
        this.f10021b = o0Var;
        this.f10023d = new JavaOnlyMap();
        this.f10024e = new c0(this.f10023d);
    }

    private static void a(WritableMap writableMap, String str, Object obj) {
        double doubleValue;
        if (obj == null) {
            writableMap.putNull(str);
            return;
        }
        if (obj instanceof Double) {
            doubleValue = ((Double) obj).doubleValue();
        } else if (obj instanceof Integer) {
            writableMap.putInt(str, ((Integer) obj).intValue());
            return;
        } else if (!(obj instanceof Number)) {
            if (obj instanceof Boolean) {
                writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
                return;
            } else if (obj instanceof String) {
                writableMap.putString(str, (String) obj);
                return;
            } else if (obj instanceof WritableArray) {
                writableMap.putArray(str, (WritableArray) obj);
                return;
            } else if (!(obj instanceof WritableMap)) {
                throw new IllegalStateException("Unknown type of animated value");
            } else {
                writableMap.putMap(str, (WritableMap) obj);
                return;
            }
        } else {
            doubleValue = ((Number) obj).doubleValue();
        }
        writableMap.putDouble(str, doubleValue);
    }

    @Override // com.swmansion.reanimated.nodes.j
    public void a() {
        if (this.f10022c == -1) {
            return;
        }
        value();
    }

    public void a(int i) {
        this.f10022c = i;
        dangerouslyRescheduleEvaluate();
    }

    public void b(int i) {
        this.f10022c = -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.swmansion.reanimated.nodes.m
    /* renamed from: evaluate */
    public Double mo321evaluate() {
        boolean z;
        WritableMap writableMap;
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (Map.Entry<String, Integer> entry : this.f10020a.entrySet()) {
            m a2 = this.mNodesManager.a(entry.getValue().intValue(), m.class);
            if (a2 instanceof s) {
                WritableMap writableMap2 = (WritableMap) a2.value();
                ReadableMapKeySetIterator keySetIterator = writableMap2.keySetIterator();
                while (keySetIterator.hasNextKey()) {
                    String nextKey = keySetIterator.nextKey();
                    if (this.mNodesManager.q.contains(nextKey)) {
                        writableMap = this.f10023d;
                        z = true;
                    } else if (this.mNodesManager.r.contains(nextKey)) {
                        z = z2;
                        z3 = true;
                        writableMap = createMap2;
                    } else {
                        z = z2;
                        z4 = true;
                        writableMap = createMap;
                    }
                    ReadableType type = writableMap2.getType(nextKey);
                    int i = a.f10025a[type.ordinal()];
                    if (i == 1) {
                        writableMap.putDouble(nextKey, writableMap2.getDouble(nextKey));
                    } else if (i == 2) {
                        writableMap.putString(nextKey, writableMap2.getString(nextKey));
                    } else if (i != 3) {
                        throw new IllegalArgumentException("Unexpected type " + type);
                    } else {
                        writableMap.putArray(nextKey, (WritableArray) writableMap2.getArray(nextKey));
                    }
                    z2 = z;
                }
                continue;
            } else {
                String key = entry.getKey();
                Object value = a2.value();
                if (this.mNodesManager.q.contains(key)) {
                    a(this.f10023d, key, value);
                    z2 = true;
                } else {
                    a(createMap2, key, value);
                    z3 = true;
                }
            }
        }
        int i2 = this.f10022c;
        if (i2 != -1) {
            if (z2) {
                this.f10021b.a(i2, this.f10024e);
            }
            if (z3) {
                this.mNodesManager.a(this.f10022c, createMap2);
            }
            if (z4) {
                WritableMap createMap3 = Arguments.createMap();
                createMap3.putInt("viewTag", this.f10022c);
                createMap3.putMap("props", createMap);
                this.mNodesManager.a("onReanimatedPropsChange", createMap3);
            }
        }
        return m.ZERO;
    }
}
