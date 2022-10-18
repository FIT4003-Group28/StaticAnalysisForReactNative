// @flow
import { TurboModuleRegistry } from 'react-native';
import type { TurboModule } from 'react-native/Libraries/TurboModule/RCTExport';

export interface Spec extends TurboModule {
    createEventPromise(): Promise<number>;
}
export default (TurboModuleRegistry.get < Spec > (
    'RTNCounter'
): ?Spec);