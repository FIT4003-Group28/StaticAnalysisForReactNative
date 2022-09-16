package com.google.cardboard.proto;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CardboardDevice {

    /* compiled from: PG */
    /* renamed from: com.google.cardboard.proto.CardboardDevice$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[aoph.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[aoph.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[aoph.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[aoph.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[aoph.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[aoph.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[aoph.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[aoph.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class DeviceParams extends aopi implements DeviceParamsOrBuilder {
        private static final DeviceParams DEFAULT_INSTANCE;
        public static final int DISTORTION_COEFFICIENTS_FIELD_NUMBER = 7;
        public static final int INTER_LENS_DISTANCE_FIELD_NUMBER = 4;
        public static final int LEFT_EYE_FIELD_OF_VIEW_ANGLES_FIELD_NUMBER = 5;
        public static final int MODEL_FIELD_NUMBER = 2;
        private static volatile aorb PARSER = null;
        public static final int PRIMARY_BUTTON_FIELD_NUMBER = 12;
        public static final int SCREEN_TO_LENS_DISTANCE_FIELD_NUMBER = 3;
        public static final int TRAY_TO_LENS_DISTANCE_FIELD_NUMBER = 6;
        public static final int VENDOR_FIELD_NUMBER = 1;
        public static final int VERTICAL_ALIGNMENT_FIELD_NUMBER = 11;
        private int bitField0_;
        private float interLensDistance_;
        private float screenToLensDistance_;
        private float trayToLensDistance_;
        private int verticalAlignment_;
        private int leftEyeFieldOfViewAnglesMemoizedSerializedSize = -1;
        private int distortionCoefficientsMemoizedSerializedSize = -1;
        private String vendor_ = "";
        private String model_ = "";
        private aopp leftEyeFieldOfViewAngles_ = emptyFloatList();
        private aopp distortionCoefficients_ = emptyFloatList();
        private int primaryButton_ = 1;

        /* compiled from: PG */
        /* loaded from: classes3.dex */
        public final class Builder extends aopa implements DeviceParamsOrBuilder {
            private Builder() {
                super(DeviceParams.DEFAULT_INSTANCE);
            }

            public Builder addAllDistortionCoefficients(Iterable iterable) {
                copyOnWrite();
                ((DeviceParams) this.instance).addAllDistortionCoefficients(iterable);
                return this;
            }

            public Builder addAllLeftEyeFieldOfViewAngles(Iterable iterable) {
                copyOnWrite();
                ((DeviceParams) this.instance).addAllLeftEyeFieldOfViewAngles(iterable);
                return this;
            }

            public Builder addDistortionCoefficients(float f) {
                copyOnWrite();
                ((DeviceParams) this.instance).addDistortionCoefficients(f);
                return this;
            }

            public Builder addLeftEyeFieldOfViewAngles(float f) {
                copyOnWrite();
                ((DeviceParams) this.instance).addLeftEyeFieldOfViewAngles(f);
                return this;
            }

            public Builder clearDistortionCoefficients() {
                copyOnWrite();
                ((DeviceParams) this.instance).clearDistortionCoefficients();
                return this;
            }

            public Builder clearInterLensDistance() {
                copyOnWrite();
                ((DeviceParams) this.instance).clearInterLensDistance();
                return this;
            }

            public Builder clearLeftEyeFieldOfViewAngles() {
                copyOnWrite();
                ((DeviceParams) this.instance).clearLeftEyeFieldOfViewAngles();
                return this;
            }

            public Builder clearModel() {
                copyOnWrite();
                ((DeviceParams) this.instance).clearModel();
                return this;
            }

            public Builder clearPrimaryButton() {
                copyOnWrite();
                ((DeviceParams) this.instance).clearPrimaryButton();
                return this;
            }

            public Builder clearScreenToLensDistance() {
                copyOnWrite();
                ((DeviceParams) this.instance).clearScreenToLensDistance();
                return this;
            }

            public Builder clearTrayToLensDistance() {
                copyOnWrite();
                ((DeviceParams) this.instance).clearTrayToLensDistance();
                return this;
            }

            public Builder clearVendor() {
                copyOnWrite();
                ((DeviceParams) this.instance).clearVendor();
                return this;
            }

            public Builder clearVerticalAlignment() {
                copyOnWrite();
                ((DeviceParams) this.instance).clearVerticalAlignment();
                return this;
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public float getDistortionCoefficients(int i) {
                return ((DeviceParams) this.instance).getDistortionCoefficients(i);
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public int getDistortionCoefficientsCount() {
                return ((DeviceParams) this.instance).getDistortionCoefficientsCount();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public List getDistortionCoefficientsList() {
                return Collections.unmodifiableList(((DeviceParams) this.instance).getDistortionCoefficientsList());
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public float getInterLensDistance() {
                return ((DeviceParams) this.instance).getInterLensDistance();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public float getLeftEyeFieldOfViewAngles(int i) {
                return ((DeviceParams) this.instance).getLeftEyeFieldOfViewAngles(i);
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public int getLeftEyeFieldOfViewAnglesCount() {
                return ((DeviceParams) this.instance).getLeftEyeFieldOfViewAnglesCount();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public List getLeftEyeFieldOfViewAnglesList() {
                return Collections.unmodifiableList(((DeviceParams) this.instance).getLeftEyeFieldOfViewAnglesList());
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public String getModel() {
                return ((DeviceParams) this.instance).getModel();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public aoob getModelBytes() {
                return ((DeviceParams) this.instance).getModelBytes();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public ButtonType getPrimaryButton() {
                return ((DeviceParams) this.instance).getPrimaryButton();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public float getScreenToLensDistance() {
                return ((DeviceParams) this.instance).getScreenToLensDistance();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public float getTrayToLensDistance() {
                return ((DeviceParams) this.instance).getTrayToLensDistance();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public String getVendor() {
                return ((DeviceParams) this.instance).getVendor();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public aoob getVendorBytes() {
                return ((DeviceParams) this.instance).getVendorBytes();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public VerticalAlignmentType getVerticalAlignment() {
                return ((DeviceParams) this.instance).getVerticalAlignment();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public boolean hasInterLensDistance() {
                return ((DeviceParams) this.instance).hasInterLensDistance();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public boolean hasModel() {
                return ((DeviceParams) this.instance).hasModel();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public boolean hasPrimaryButton() {
                return ((DeviceParams) this.instance).hasPrimaryButton();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public boolean hasScreenToLensDistance() {
                return ((DeviceParams) this.instance).hasScreenToLensDistance();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public boolean hasTrayToLensDistance() {
                return ((DeviceParams) this.instance).hasTrayToLensDistance();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public boolean hasVendor() {
                return ((DeviceParams) this.instance).hasVendor();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public boolean hasVerticalAlignment() {
                return ((DeviceParams) this.instance).hasVerticalAlignment();
            }

            public Builder setDistortionCoefficients(int i, float f) {
                copyOnWrite();
                ((DeviceParams) this.instance).setDistortionCoefficients(i, f);
                return this;
            }

            public Builder setInterLensDistance(float f) {
                copyOnWrite();
                ((DeviceParams) this.instance).setInterLensDistance(f);
                return this;
            }

            public Builder setLeftEyeFieldOfViewAngles(int i, float f) {
                copyOnWrite();
                ((DeviceParams) this.instance).setLeftEyeFieldOfViewAngles(i, f);
                return this;
            }

            public Builder setModel(String str) {
                copyOnWrite();
                ((DeviceParams) this.instance).setModel(str);
                return this;
            }

            public Builder setModelBytes(aoob aoobVar) {
                copyOnWrite();
                ((DeviceParams) this.instance).setModelBytes(aoobVar);
                return this;
            }

            public Builder setPrimaryButton(ButtonType buttonType) {
                copyOnWrite();
                ((DeviceParams) this.instance).setPrimaryButton(buttonType);
                return this;
            }

            public Builder setScreenToLensDistance(float f) {
                copyOnWrite();
                ((DeviceParams) this.instance).setScreenToLensDistance(f);
                return this;
            }

            public Builder setTrayToLensDistance(float f) {
                copyOnWrite();
                ((DeviceParams) this.instance).setTrayToLensDistance(f);
                return this;
            }

            public Builder setVendor(String str) {
                copyOnWrite();
                ((DeviceParams) this.instance).setVendor(str);
                return this;
            }

            public Builder setVendorBytes(aoob aoobVar) {
                copyOnWrite();
                ((DeviceParams) this.instance).setVendorBytes(aoobVar);
                return this;
            }

            public Builder setVerticalAlignment(VerticalAlignmentType verticalAlignmentType) {
                copyOnWrite();
                ((DeviceParams) this.instance).setVerticalAlignment(verticalAlignmentType);
                return this;
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        /* compiled from: PG */
        /* loaded from: classes3.dex */
        public enum ButtonType implements aopm {
            NONE(0),
            MAGNET(1),
            TOUCH(2),
            INDIRECT_TOUCH(3);
            
            public static final int INDIRECT_TOUCH_VALUE = 3;
            public static final int MAGNET_VALUE = 1;
            public static final int NONE_VALUE = 0;
            public static final int TOUCH_VALUE = 2;
            private static final aopn internalValueMap = new aopn() { // from class: com.google.cardboard.proto.CardboardDevice.DeviceParams.ButtonType.1
                @Override // defpackage.aopn
                /* renamed from: findValueByNumber  reason: collision with other method in class */
                public ButtonType mo283findValueByNumber(int i) {
                    return ButtonType.forNumber(i);
                }
            };
            private final int value;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PG */
            /* loaded from: classes3.dex */
            public final class ButtonTypeVerifier implements aopo {
                static final aopo INSTANCE = new ButtonTypeVerifier();

                private ButtonTypeVerifier() {
                }

                @Override // defpackage.aopo
                public boolean isInRange(int i) {
                    return ButtonType.forNumber(i) != null;
                }
            }

            ButtonType(int i) {
                this.value = i;
            }

            public static ButtonType forNumber(int i) {
                if (i != 0) {
                    if (i == 1) {
                        return MAGNET;
                    }
                    if (i == 2) {
                        return TOUCH;
                    }
                    if (i == 3) {
                        return INDIRECT_TOUCH;
                    }
                    return null;
                }
                return NONE;
            }

            public static aopn internalGetValueMap() {
                return internalValueMap;
            }

            public static aopo internalGetVerifier() {
                return ButtonTypeVerifier.INSTANCE;
            }

            @Override // defpackage.aopm
            public final int getNumber() {
                return this.value;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(getNumber());
            }
        }

        /* compiled from: PG */
        /* loaded from: classes3.dex */
        public enum VerticalAlignmentType implements aopm {
            BOTTOM(0),
            CENTER(1),
            TOP(2);
            
            public static final int BOTTOM_VALUE = 0;
            public static final int CENTER_VALUE = 1;
            public static final int TOP_VALUE = 2;
            private static final aopn internalValueMap = new aopn() { // from class: com.google.cardboard.proto.CardboardDevice.DeviceParams.VerticalAlignmentType.1
                @Override // defpackage.aopn
                /* renamed from: findValueByNumber  reason: collision with other method in class */
                public VerticalAlignmentType mo283findValueByNumber(int i) {
                    return VerticalAlignmentType.forNumber(i);
                }
            };
            private final int value;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PG */
            /* loaded from: classes3.dex */
            public final class VerticalAlignmentTypeVerifier implements aopo {
                static final aopo INSTANCE = new VerticalAlignmentTypeVerifier();

                private VerticalAlignmentTypeVerifier() {
                }

                @Override // defpackage.aopo
                public boolean isInRange(int i) {
                    return VerticalAlignmentType.forNumber(i) != null;
                }
            }

            VerticalAlignmentType(int i) {
                this.value = i;
            }

            public static VerticalAlignmentType forNumber(int i) {
                if (i != 0) {
                    if (i == 1) {
                        return CENTER;
                    }
                    if (i == 2) {
                        return TOP;
                    }
                    return null;
                }
                return BOTTOM;
            }

            public static aopn internalGetValueMap() {
                return internalValueMap;
            }

            public static aopo internalGetVerifier() {
                return VerticalAlignmentTypeVerifier.INSTANCE;
            }

            @Override // defpackage.aopm
            public final int getNumber() {
                return this.value;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(getNumber());
            }
        }

        static {
            DeviceParams deviceParams = new DeviceParams();
            DEFAULT_INSTANCE = deviceParams;
            aopi.registerDefaultInstance(DeviceParams.class, deviceParams);
        }

        private DeviceParams() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDistortionCoefficients(Iterable iterable) {
            ensureDistortionCoefficientsIsMutable();
            aonk.addAll(iterable, (List) this.distortionCoefficients_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLeftEyeFieldOfViewAngles(Iterable iterable) {
            ensureLeftEyeFieldOfViewAnglesIsMutable();
            aonk.addAll(iterable, (List) this.leftEyeFieldOfViewAngles_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDistortionCoefficients(float f) {
            ensureDistortionCoefficientsIsMutable();
            this.distortionCoefficients_.h(f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLeftEyeFieldOfViewAngles(float f) {
            ensureLeftEyeFieldOfViewAnglesIsMutable();
            this.leftEyeFieldOfViewAngles_.h(f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDistortionCoefficients() {
            this.distortionCoefficients_ = emptyFloatList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInterLensDistance() {
            this.bitField0_ &= -9;
            this.interLensDistance_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLeftEyeFieldOfViewAngles() {
            this.leftEyeFieldOfViewAngles_ = emptyFloatList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearModel() {
            this.bitField0_ &= -3;
            this.model_ = getDefaultInstance().getModel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrimaryButton() {
            this.bitField0_ &= -65;
            this.primaryButton_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScreenToLensDistance() {
            this.bitField0_ &= -5;
            this.screenToLensDistance_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrayToLensDistance() {
            this.bitField0_ &= -33;
            this.trayToLensDistance_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVendor() {
            this.bitField0_ &= -2;
            this.vendor_ = getDefaultInstance().getVendor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVerticalAlignment() {
            this.bitField0_ &= -17;
            this.verticalAlignment_ = 0;
        }

        private void ensureDistortionCoefficientsIsMutable() {
            aopp aoppVar = this.distortionCoefficients_;
            if (!aoppVar.c()) {
                this.distortionCoefficients_ = aopi.mutableCopy(aoppVar);
            }
        }

        private void ensureLeftEyeFieldOfViewAnglesIsMutable() {
            aopp aoppVar = this.leftEyeFieldOfViewAngles_;
            if (!aoppVar.c()) {
                this.leftEyeFieldOfViewAngles_ = aopi.mutableCopy(aoppVar);
            }
        }

        public static DeviceParams getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DeviceParams parseDelimitedFrom(InputStream inputStream) {
            return (DeviceParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeviceParams parseFrom(aoob aoobVar) {
            return (DeviceParams) aopi.parseFrom(DEFAULT_INSTANCE, aoobVar);
        }

        public static aorb parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDistortionCoefficients(int i, float f) {
            ensureDistortionCoefficientsIsMutable();
            this.distortionCoefficients_.f(i, f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInterLensDistance(float f) {
            this.bitField0_ |= 8;
            this.interLensDistance_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLeftEyeFieldOfViewAngles(int i, float f) {
            ensureLeftEyeFieldOfViewAnglesIsMutable();
            this.leftEyeFieldOfViewAngles_.f(i, f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModel(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.model_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModelBytes(aoob aoobVar) {
            this.model_ = aoobVar.E();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrimaryButton(ButtonType buttonType) {
            this.primaryButton_ = buttonType.getNumber();
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScreenToLensDistance(float f) {
            this.bitField0_ |= 4;
            this.screenToLensDistance_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrayToLensDistance(float f) {
            this.bitField0_ |= 32;
            this.trayToLensDistance_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVendor(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.vendor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVendorBytes(aoob aoobVar) {
            this.vendor_ = aoobVar.E();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVerticalAlignment(VerticalAlignmentType verticalAlignmentType) {
            this.verticalAlignment_ = verticalAlignmentType.getNumber();
            this.bitField0_ |= 16;
        }

        @Override // defpackage.aopi
        protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
            aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
            switch (aophVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005$\u0006ခ\u0005\u0007$\u000bဌ\u0004\fဌ\u0006", new Object[]{"bitField0_", "vendor_", "model_", "screenToLensDistance_", "interLensDistance_", "leftEyeFieldOfViewAngles_", "trayToLensDistance_", "distortionCoefficients_", "verticalAlignment_", VerticalAlignmentType.internalGetVerifier(), "primaryButton_", ButtonType.internalGetVerifier()});
                case 3:
                    return new DeviceParams();
                case 4:
                    return new Builder(null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    aorb aorbVar = PARSER;
                    if (aorbVar == null) {
                        synchronized (DeviceParams.class) {
                            aorbVar = PARSER;
                            if (aorbVar == null) {
                                aorbVar = new aopb(DEFAULT_INSTANCE);
                                PARSER = aorbVar;
                            }
                        }
                    }
                    return aorbVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public float getDistortionCoefficients(int i) {
            return this.distortionCoefficients_.d(i);
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public int getDistortionCoefficientsCount() {
            return this.distortionCoefficients_.size();
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public List getDistortionCoefficientsList() {
            return this.distortionCoefficients_;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public float getInterLensDistance() {
            return this.interLensDistance_;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public float getLeftEyeFieldOfViewAngles(int i) {
            return this.leftEyeFieldOfViewAngles_.d(i);
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public int getLeftEyeFieldOfViewAnglesCount() {
            return this.leftEyeFieldOfViewAngles_.size();
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public List getLeftEyeFieldOfViewAnglesList() {
            return this.leftEyeFieldOfViewAngles_;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public String getModel() {
            return this.model_;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public aoob getModelBytes() {
            return aoob.z(this.model_);
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public ButtonType getPrimaryButton() {
            ButtonType forNumber = ButtonType.forNumber(this.primaryButton_);
            return forNumber == null ? ButtonType.MAGNET : forNumber;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public float getScreenToLensDistance() {
            return this.screenToLensDistance_;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public float getTrayToLensDistance() {
            return this.trayToLensDistance_;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public String getVendor() {
            return this.vendor_;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public aoob getVendorBytes() {
            return aoob.z(this.vendor_);
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public VerticalAlignmentType getVerticalAlignment() {
            VerticalAlignmentType forNumber = VerticalAlignmentType.forNumber(this.verticalAlignment_);
            return forNumber == null ? VerticalAlignmentType.BOTTOM : forNumber;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public boolean hasInterLensDistance() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public boolean hasModel() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public boolean hasPrimaryButton() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public boolean hasScreenToLensDistance() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public boolean hasTrayToLensDistance() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public boolean hasVendor() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public boolean hasVerticalAlignment() {
            return (this.bitField0_ & 16) != 0;
        }

        public static Builder newBuilder(DeviceParams deviceParams) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(deviceParams);
        }

        public static DeviceParams parseDelimitedFrom(InputStream inputStream, aoos aoosVar) {
            return (DeviceParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, aoosVar);
        }

        public static DeviceParams parseFrom(aoob aoobVar, aoos aoosVar) {
            return (DeviceParams) aopi.parseFrom(DEFAULT_INSTANCE, aoobVar, aoosVar);
        }

        public static DeviceParams parseFrom(aoog aoogVar) {
            return (DeviceParams) aopi.parseFrom(DEFAULT_INSTANCE, aoogVar);
        }

        public static DeviceParams parseFrom(aoog aoogVar, aoos aoosVar) {
            return (DeviceParams) aopi.parseFrom(DEFAULT_INSTANCE, aoogVar, aoosVar);
        }

        public static DeviceParams parseFrom(InputStream inputStream) {
            return (DeviceParams) aopi.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeviceParams parseFrom(InputStream inputStream, aoos aoosVar) {
            return (DeviceParams) aopi.parseFrom(DEFAULT_INSTANCE, inputStream, aoosVar);
        }

        public static DeviceParams parseFrom(ByteBuffer byteBuffer) {
            return (DeviceParams) aopi.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static DeviceParams parseFrom(ByteBuffer byteBuffer, aoos aoosVar) {
            return (DeviceParams) aopi.parseFrom(DEFAULT_INSTANCE, byteBuffer, aoosVar);
        }

        public static DeviceParams parseFrom(byte[] bArr) {
            return (DeviceParams) aopi.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DeviceParams parseFrom(byte[] bArr, aoos aoosVar) {
            return (DeviceParams) aopi.parseFrom(DEFAULT_INSTANCE, bArr, aoosVar);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface DeviceParamsOrBuilder extends aoqv {
        float getDistortionCoefficients(int i);

        int getDistortionCoefficientsCount();

        List getDistortionCoefficientsList();

        float getInterLensDistance();

        float getLeftEyeFieldOfViewAngles(int i);

        int getLeftEyeFieldOfViewAnglesCount();

        List getLeftEyeFieldOfViewAnglesList();

        String getModel();

        aoob getModelBytes();

        DeviceParams.ButtonType getPrimaryButton();

        float getScreenToLensDistance();

        float getTrayToLensDistance();

        String getVendor();

        aoob getVendorBytes();

        DeviceParams.VerticalAlignmentType getVerticalAlignment();

        boolean hasInterLensDistance();

        boolean hasModel();

        boolean hasPrimaryButton();

        boolean hasScreenToLensDistance();

        boolean hasTrayToLensDistance();

        boolean hasVendor();

        boolean hasVerticalAlignment();
    }

    private CardboardDevice() {
    }

    public static void registerAllExtensions(aoos aoosVar) {
    }
}
